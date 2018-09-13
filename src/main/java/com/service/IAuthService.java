package com.service;

import java.util.List;

import com.model.Auth;

public interface IAuthService {
	
	public void updateAuth(Auth auth);
	public void addAuth(Auth auth);
	public void removeByRoleId(String roleId);
	public List<Auth> queryByRoleId(String roleId);
	


}
