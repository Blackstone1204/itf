package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AuthMapper;
import com.model.Auth;
import com.service.IAuthService;
@Service
public class AuthService implements IAuthService{
	
	@Autowired
	AuthMapper authMapper;
	public void updateAuth(Auth auth){
		authMapper.updateByPrimaryKeySelective(auth);
	}
	@Override
	public void addAuth(Auth auth) {
		// TODO Auto-generated method stub
		authMapper.insert(auth);
		
	}
	@Override
	public void removeByRoleId(String roleId) {
		// TODO Auto-generated method stub
		authMapper.deleteByRoleId(roleId);
		
	}
	@Override
	public List<Auth> queryByRoleId(String roleId) {
		// TODO Auto-generated method stub
		return authMapper.selectByRoleI(roleId);
	}





}
