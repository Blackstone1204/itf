package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.PlanDetail;
import com.serviceimpl.PlanDetailService;
import com.utils.IdGenerator;

import entity.Response;


@RestController
public class PlanDetailCtrl {
	
	@Autowired PlanDetailService planDetailService;
	@Autowired IdGenerator gen;
	
	@PostMapping("/api/planDetail/add")
	public Response add(@RequestBody PlanDetail planDetail){
		
		planDetailService.addDetail(planDetail);
		return new Response(1,"add one detail success",planDetail.getId()
				);
		
	}
	
	
	@PostMapping("/api/planDetail/del")
	public Response del(@RequestBody String id){
		
		planDetailService.delOneDetailById(id);
		return new Response(1,"del one detail success",id);
		
	}
	
	
	@PostMapping("/api/planDetail/update")
	public Response update(@RequestBody PlanDetail planDetail){
		
		planDetailService.updateOneDetail(planDetail);
		return new Response(1,"update one detail success",planDetail.getId());
		
	}
	
	
	

}
