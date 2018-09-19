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
import com.model.Plan;
import com.serviceimpl.AccountService;
import com.serviceimpl.AuthService;
import com.serviceimpl.ParamInfoService;
import com.serviceimpl.PlanService;
import com.utils.IdGenerator;
import com.utils.JwtUtil;
import com.utils.MD5Utils;

import entity.Response;

@RestController
public class PlanCtrl {
	
	@Autowired
	private PlanService planService;
	@Autowired
	private IdGenerator gen;
	
	@PostMapping("/api/plan/add")
	public Response add(@RequestBody Plan plan){
		
		String id=gen.getMd5Id();
		planService.add(plan);


		return new Response(1,"plan add success",id);
		
	}
	
	@PostMapping("/api/plan/del")
	public Response del(String id){
		
		List<Plan> list=planService.queryByPlanId(id);
		if(list.size()<1)return new Response(101,"plan del faild id="+id,id);
		Plan plan=list.get(0);
		plan.setIsDelete("1");
		planService.update(plan);
		
		return new Response(1,"plan del id="+id,id);
		
	}
	
	@PostMapping("/api/plan/update")
	public Response update(Plan plan){
		
		planService.update(plan);
		return  new Response(1,"plan update success",plan.getId());
		
	}
	

	
	
	

}
