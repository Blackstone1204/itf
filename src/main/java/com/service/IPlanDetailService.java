package com.service;

import java.util.List;

import com.model.PlanDetail;

public interface IPlanDetailService {
	public void addDetail(PlanDetail planDetail);
	public void delOneDetailById(String id);
	public void updateOneDetail(PlanDetail planDetail);
	public List<PlanDetail> queryOneDetailById(String id);
	public List<PlanDetail> queryAllByPlanId(String planId);

	public void carryOut(String id);
	
	public void carryOut(List<String> listID);

}
