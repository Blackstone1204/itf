package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LocalVariableMapper;
import com.model.LocalVariable;
import com.service.ILocalVariableService;
@Service
public class LocalVariableService implements ILocalVariableService{
	
	@Autowired
	LocalVariableMapper localVariableMapper;

	@Override
	public void addLocalVariable(LocalVariable localVariable) {
		// TODO Auto-generated method stub
		localVariableMapper.insert(localVariable);
		
	}

	@Override
	public void removeByPlanId(String planId) {
		// TODO Auto-generated method stub
		localVariableMapper.deleteByPlanId(planId);
		
	}

	@Override
	public void removeById(String id) {
		// TODO Auto-generated method stub
		localVariableMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void update(LocalVariable localVariable) {
		// TODO Auto-generated method stub
		localVariableMapper.updateByPrimaryKey(localVariable);
		
	}

	@Override
	public List<LocalVariable> queryByPlanId(String planId) {
		// TODO Auto-generated method stub
		return localVariableMapper.selectByPlanId(planId);
				
	}

}
