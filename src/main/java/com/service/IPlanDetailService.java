package com.service;

import java.util.List;

import com.model.PlanDetail;

public interface IPlanDetailService {
	public void addPlan(PlanDetail plan);
	public void delPlanById(String id);
	public void updatePlan(PlanDetail plan);
	public List<PlanDetail> queryPlanById(String id);
	public void carryOut(String id);

}
