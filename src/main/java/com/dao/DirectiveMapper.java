package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Directive;

public interface DirectiveMapper {
    int deleteByTargetId(@Param("targetId")String targetId);

    int insert(Directive record);

    List<Directive> selectByTargetId(String id);

    int updateByPrimaryKey(Directive record);
}