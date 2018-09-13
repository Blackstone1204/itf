package com.dao;

import java.util.List;

import com.model.Plan;

public interface PlanMapper {
    void deleteByPrimaryKey(String id);

    void insert(Plan record);

    List<Plan> selectByPrimaryKey(String id);
    
    List<String>  selectTargetById(String id);

    void updateByPrimaryKey(Plan record);
    
}