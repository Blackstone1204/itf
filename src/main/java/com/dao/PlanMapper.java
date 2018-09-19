package com.dao;

import java.util.List;

import com.model.Plan;

public interface PlanMapper {
	public List<Plan> selectAll();
	public List<Plan> selectByPlanId(String id);
	public void deleteByPrimaryKey(String id);
    public void insert(Plan plan); 
    public void updateByPrimaryKey(Plan plan);

}
