package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Target;
import com.serviceimpl.TargetService;
import com.utils.IdGenerator;

import entity.Response;

@RestController
public class TargetCtrl {
	
	@Autowired
	private TargetService targetService;
	
	@Autowired
	private IdGenerator gen;
	
	@GetMapping("/api/target/queryAll")
	@ResponseBody
    public Response queryALl() {

		return new Response(1,"查询全部用例",targetService.queryAll());
		
   
    }
	
	
	
	@PostMapping("/api/target/add")
	@ResponseBody
    public Response add(@RequestBody Target target) {
		String id=gen.getMd5Id();
		target.setId(id);
		targetService.add(target);

		return new Response(1,"新建用例",id);
		
   
    }
	
	@PostMapping("/api/target/del")
	@ResponseBody
    public Response remove(@RequestBody Target target) {
        System.out.println("get id="+target.getId());
        target.setIsDelete("1");
		targetService.update(target);
		return new Response(1,"删除用例",target.getId());
		
   
    }
	
	@PostMapping("/api/target/update")
	@ResponseBody
    public Response update(@RequestBody Target target) {

		targetService.update(target);

		return new Response(1,"更新用例",target);
		
   
    }
	
	
	
	
	
	
	
	
	
	
	

}
