package com.dao;

import java.util.List;

import com.model.Target;

public interface TargetMapper {
    int deleteByPrimaryKey(String id);

    int insert(Target record);

    Target selectByPrimaryKey(String id);
    
    List<Target> selectAll();
    
    List<Target> selectChildren(String parentId);
    
    List<Target> selectTopChildren();
    
    int updateByPrimaryKey(Target record);
}