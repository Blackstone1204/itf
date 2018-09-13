package com.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import com.model.ParamInfo;
import com.serviceimpl.AccountService;
import com.serviceimpl.AuthService;
import com.serviceimpl.ParamInfoService;
import com.utils.IdGenerator;
import com.utils.JwtUtil;

import entity.Response;

@RestController
public class ParamsCtrl {
	
	@Autowired
	private ParamInfoService paramInfoService;
	@Autowired
	private IdGenerator gen;
	
	@PostMapping("/api/paramInfo/add")
	public Response login(@RequestBody List<ParamInfo> params){
		List<String> a=new ArrayList<String>();
		
		for(ParamInfo p:params){
			String id=gen.getMd5Id();
			p.setId(id);
			paramInfoService.addParamInfo(p);
			
			a.add(id);
			
		}
		
		
		return new Response(1,String.format("添加%s的参数信息成功",params.get(0).getTargetId()),a);
		
	}
	
	

}
