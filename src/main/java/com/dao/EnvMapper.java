package com.dao;

import java.util.List;

import com.model.Env;

public interface EnvMapper {
    int deleteByPrimaryKey(String id);
    int insert(Env record);
    List<Env> selectByPrimaryKey(String id);
    int updateByPrimaryKey(Env record);
}