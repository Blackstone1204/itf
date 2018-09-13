package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.GlobalVariableMapper;
import com.model.GlobalVariable;
import com.service.IGlobalVariableService;
@Service
public class GlobalVariableService implements IGlobalVariableService {

	@Autowired
	GlobalVariableMapper globalVariableMapper;
	@Override
	public void addGlobal(GlobalVariable globalVariable) {
		// TODO Auto-generated method stub
		globalVariableMapper.insert(globalVariable);

	}

	@Override
	public void removeGlobal(String id) {
		// TODO Auto-generated method stub
		globalVariableMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void updateGlobal(GlobalVariable globalVariable) {
		// TODO Auto-generated method stub
		globalVariableMapper.updateByPrimaryKey(globalVariable);

	}

	@Override
	public List<GlobalVariable> queryAll() {
		// TODO Auto-generated method stub
		return globalVariableMapper.selectAll();
	}

}
