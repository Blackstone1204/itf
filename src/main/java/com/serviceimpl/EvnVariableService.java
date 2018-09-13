package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EnvVariableMapper;
import com.model.EnvVariable;
import com.service.IEnvVariableService;
@Service
public class EvnVariableService implements IEnvVariableService {
	@Autowired
	EnvVariableMapper envVariableMapper;

	@Override
	public void addEnvVariable(EnvVariable envVariable) {
		// TODO Auto-generated method stub
		
		envVariableMapper.insert(envVariable);

	}

	@Override
	public void removeByEnvId(String envId) {
		// TODO Auto-generated method stub
		
		envVariableMapper.deleteByEnvId(envId);

	}

	@Override
	public void removeById(String id) {
		// TODO Auto-generated method stub
		
		envVariableMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void update(EnvVariable envVariable) {
		// TODO Auto-generated method stub
		
		envVariableMapper.updateByPrimaryKey(envVariable);

	}

	@Override
	public List<EnvVariable> queryByEnvId(String envId) {
		// TODO Auto-generated method stub
		return envVariableMapper.selectByEnvId(envId);
	}

}
