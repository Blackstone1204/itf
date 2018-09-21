package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RoleMapper;
import com.model.Role;
import com.service.IRoleService;
@Service
public class RoleService implements IRoleService {

	
	@Autowired 
	RoleMapper roleMapper;
	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.insert(role);

	}

	@Override
	public void delRoleById(String id) {
		// TODO Auto-generated method stub
		roleMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.updateByPrimaryKeySelective(role);

	}

	@Override
	public List<Role> queryRoleById(String id) {
		// TODO Auto-generated method stub
		
		return roleMapper.selectByPrimaryKey(id);

	}

	@Override
	public List<Role> queryAll() {
		// TODO Auto-generated method stub
		return roleMapper.selectAll();
	}

}
