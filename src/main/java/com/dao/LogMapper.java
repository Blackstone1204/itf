package com.dao;

import java.util.List;

import com.model.Log;

public interface LogMapper {
    void deleteByPrimaryKey(String id);

    void insert(Log record);

    List<Log> selectByPrimaryKey(String id);
    
    List<Log> selectAll();

    void  updateByPrimaryKey(Log record);
}