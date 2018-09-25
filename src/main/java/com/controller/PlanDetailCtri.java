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
import com.model.PlanDetail;
import com.serviceimpl.AccountService;
import com.serviceimpl.AuthService;
import com.serviceimpl.ParamInfoService;
import com.serviceimpl.PlanDetailService;
import com.serviceimpl.PlanService;
import com.utils.IdGenerator;
import com.utils.JwtUtil;
import com.utils.MD5Utils;

import entity.Response;

@RestController
public class PlanDetailCtri {
	
	@Autowired
	private PlanDetailService planDetailService;
	@Autowired
	private IdGenerator gen;
	
	@PostMapping("/api/detail/add")
	public Response add(@RequestBody PlanDetail detail ){
		
		String id=gen.getMd5Id();
		detail.setId(id);
		planDetailService.addDetail(detail);


		return new Response(1,"plandetail add success",id);
		
	}
	
	
	
	
	

}
