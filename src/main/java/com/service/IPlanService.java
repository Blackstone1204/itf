package com.service;

import java.util.List;

import com.model.Plan;

public interface IPlanService {
	public void addPlan(Plan plan);
	public void delPlanById(String id);
	public void updatePlan(Plan plan);
	public List<Plan> queryPlanById(String id);
	public void carryOut(String id);

}
