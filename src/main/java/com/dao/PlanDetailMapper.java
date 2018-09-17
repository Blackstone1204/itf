package com.dao;

import java.util.List;

import com.model.PlanDetail;

public interface PlanDetailMapper {
    void deleteByPrimaryKey(String id);

    void insert(PlanDetail record);

    List<PlanDetail> selectByPrimaryKey(String id);
    
    List<String>  selectTargetById(String id);

    void updateByPrimaryKey(PlanDetail record);
    
}