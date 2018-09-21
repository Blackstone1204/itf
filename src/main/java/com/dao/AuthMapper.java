package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Auth;

public interface AuthMapper {
    void deleteByPrimaryKey(String id);
    
    void deleteByRoleId(@Param("roleId") String roleId);

    void  insert(Auth record);

    Auth selectByPrimaryKey(String id);
    
    List<Auth> selectByRoleI(@Param("roldId") String roleId);

    void updateByPrimaryKey(Auth record);
    
    void updateByPrimaryKeySelective(Auth record);
}