package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Account;
import com.serviceimpl.AccountService;
import com.utils.IdGenerator;

@RestController
public class AccountCtrl {
	
	@Autowired
	private AccountService accountService;


	
/**
 ******************
 *descripton:add account
 ******
 *author: blackstone
 */
	
	@PostMapping(value="/api/account/add")
	@ResponseBody
	public Map<String,Object> addAccount(@RequestBody Account account) throws InterruptedException{
		
		//AccountService serivce=SpringContextHolder.getBean("accountService");
//		System.out.println("account:"+account.getAccountName());
        String id=new IdGenerator().getMd5Id();
        account.setId(id);
		accountService.addAccount(account);
		
	
		
		Map<String,Object> res=new HashMap<String, Object>();
		res.put("code",1);
		res.put("msg","账号添加成功");
		res.put("accountId", id);
	
		return res;
	}

	
	
	@GetMapping("/api/account/queryAll")
	@ResponseBody
	public Map<String,Object> queryAll() throws InterruptedException{
		
		List<Account> list=accountService.queryAll();
		
		Map<String,Object> res=new HashMap<String, Object>();
		res.put("code",1);
		res.put("msg","查询所有账号");
		res.put("data",list);
	
		return res;
	}
	
	
	
	@GetMapping("/api/account/query")
	@ResponseBody
	public Map<String,Object> queryAccountById(String id) throws InterruptedException{
		
        Account account=accountService.queryByAccountId(id).get(0);

		
		Map<String,Object> res=new HashMap<String, Object>();
		res.put("code",1);
		res.put("msg","查询账号成功");
		res.put("data",account);
	
		return res;
	}
	
	

	
	
}
