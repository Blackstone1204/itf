package com.dao;

import java.util.List;

import com.model.Result;

public interface ResultMapper {
    void deleteByPrimaryKey(String id);

    void insert(Result record);

    List<Result> selectByPrimaryKey(String id);
    
    List<Result> selectByPlanId(String planId);

    int updateByPrimaryKey(Result record);
}