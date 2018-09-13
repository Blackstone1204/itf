package com.dao;

import java.util.List;

import com.model.EnvVariable;

public interface EnvVariableMapper {
    void deleteByPrimaryKey(String id);
    
    void deleteByEnvId(String envId);

    void insert(EnvVariable record);

    List<EnvVariable> selectByEnvId(String envid);

    void updateByPrimaryKey(EnvVariable record);
}