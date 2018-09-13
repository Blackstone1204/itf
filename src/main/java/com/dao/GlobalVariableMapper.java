package com.dao;

import java.util.List;

import com.model.GlobalVariable;

public interface GlobalVariableMapper {
    int deleteByPrimaryKey(String id);

    int insert(GlobalVariable record);

    List<GlobalVariable> selectByPrimaryKey(String id);
    
    List<GlobalVariable> selectAll();

    void updateByPrimaryKey(GlobalVariable record);
}