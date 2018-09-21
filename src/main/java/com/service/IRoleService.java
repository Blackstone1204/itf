package com.service;

import java.util.List;

import com.model.Role;

public interface IRoleService {
	public void addRole(Role role);
	public void delRoleById(String id);
	public void updateRole(Role role);
	public List<Role> queryRoleById(String id);
	public List<Role> queryAll();

}
