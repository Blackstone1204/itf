package com.dao;

import java.util.List;

import com.model.PlanDetail;

public interface PlanDetailMapper {
	
    void deleteByPrimaryKey(String id);

    void insert(PlanDetail record);

    List<PlanDetail> selectByPrimaryKey(String id);
    
    List<PlanDetail>  selectAllByPlanId(String planId);

    void updateByPrimaryKey(PlanDetail record);
    
}