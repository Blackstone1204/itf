package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountMapper;
import com.model.Account;
import com.service.IAccountService;


@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private AccountMapper accountMapper;

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		accountMapper.insert(account);
		
	}

	@Override
	public void delAccountByAccountId(String id) {
		// TODO Auto-generated method stub
		
		accountMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		accountMapper.updateByPrimaryKey(account);
		
	}

	@Override
	public List<Account> queryByAccountId(String id) {
		// TODO Auto-generated method stub
		return accountMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Account> queryAll() {
		// TODO Auto-generated method stub
		return  accountMapper.selectAll();
	}

	@Override
	public boolean valid(String account, String password) {
		// TODO Auto-generated method stub

		return accountMapper.checkAccount(account, password)==1;
	}

	@Override
	public String queryAccountId(String account) {
		// TODO Auto-generated method stub
		return accountMapper.selectAccountId(account);
	}



}
