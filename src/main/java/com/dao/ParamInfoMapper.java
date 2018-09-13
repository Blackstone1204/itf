package com.dao;

import java.util.List;

import com.model.ParamInfo;

public interface ParamInfoMapper {
    void deleteByPrimaryKey(String id);

    void  insert(ParamInfo record);


    List<ParamInfo> selectByPrimaryKey(String id);
    
    List<ParamInfo> selectByTargetId(String targetId);


    void  updateByPrimaryKey(ParamInfo record);
}