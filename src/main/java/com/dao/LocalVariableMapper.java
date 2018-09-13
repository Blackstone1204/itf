package com.dao;

import java.util.List;

import com.model.LocalVariable;
import com.model.LocalVariable;

public interface LocalVariableMapper {
    void deleteByPrimaryKey(String id);
    
    void deleteByPlanId(String planId);

    void insert(LocalVariable record);

    List<LocalVariable> selectByPlanId(String planId);

    void updateByPrimaryKey(LocalVariable record);
}