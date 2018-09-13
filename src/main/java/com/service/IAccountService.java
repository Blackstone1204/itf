package com.service;

import java.util.List;

import com.model.Account;

public interface IAccountService {
	
	public void addAccount(Account account);
	public void delAccountByAccountId(String id);
	public void updateAccount(Account account);
	public List<Account> queryByAccountId(String id);
	public List<Account> queryAll();
	
	public boolean valid(String account,String password);
	public String queryAccountId(String account);



}
