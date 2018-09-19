package com.service;

import java.util.List;

import com.model.Plan;

public interface IPlanService {
	
	public List<Plan> queryAll();
	public List<Plan> queryByPlanId(String id);
	public void  update(Plan plan);
	public void add(Plan plan);
	public void run(String planId);

}
