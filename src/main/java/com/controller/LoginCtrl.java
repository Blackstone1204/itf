package com.controller;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.config.WebSecurityConfig;
import com.model.Account;
import com.serviceimpl.AccountService;
import com.serviceimpl.AuthService;
import com.utils.JwtUtil;

@RestController
public class LoginCtrl {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/account/login")
	public Map<String,Object> login(@RequestBody Account account,HttpSession session,HttpServletResponse rps){
		
		int code=-1;
		String msg="账号不存在";
		String access_token="-1";
		String accountId="-1";
		
		if(accountService.valid(account.getAccount(), account.getPassword())){
			code=1;
			msg="登录成功";
			access_token=JwtUtil.generateToken(account.getAccount());
			accountId=accountService.queryAccountId(account.getAccount());
			
			
		}
		
		Map<String,Object> result=new HashMap<String, Object>();
		result.put("code",code);
		result.put("msg",msg);
		result.put("access_token", access_token);
		result.put("data",accountId);
		
		return result;
		
	}
	
	
	@GetMapping("/account/logout")
	@ResponseBody
    public Map<String,Object> logout(String accountId,HttpSession session) {

		Map<String,Object> result=new HashMap<String, Object>();
		result.put("code",1);
		result.put("msg","用户退出");
		return result;
		
   
    }

}
