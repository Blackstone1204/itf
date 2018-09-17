package com.dao;

import java.util.List;

import com.model.Plan;

public interface PlanMapper {
	public List<Plan> selectAll();
	public void deleteByPrimaryKey(String id);
    public void insert(Plan plan); 
    public void updateByPrimaryKey(Plan plan);

}
