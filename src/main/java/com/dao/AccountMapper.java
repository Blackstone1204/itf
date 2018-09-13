package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.model.Account;

public interface AccountMapper {
    void deleteByPrimaryKey(String id);

    void insert(Account record);

    List<Account> selectByPrimaryKey(String id);
    
    List<Account> selectAll();

    void updateByPrimaryKey(Account record);
    
    int checkAccount(@Param("account")String account,@Param("password")String password);
    
    String selectAccountId(@Param("account")String account);
}