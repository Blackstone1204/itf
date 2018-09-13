package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EnvMapper;
import com.model.Env;
import com.service.IEnvService;
@Service
public class EnvService implements IEnvService {
	
	@Autowired
	EnvMapper envMapper;

	@Override
	public void addEnv(Env env) {
		// TODO Auto-generated method stub
		
		envMapper.insert(env);
	}

	@Override
	public void removeEnv(String id) {
		// TODO Auto-generated method stub
		envMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateEnv(Env env) {
		// TODO Auto-generated method stub
		envMapper.updateByPrimaryKey(env);
		
	}

	@Override
	public void queryEnv(String id) {
		// TODO Auto-generated method stub
		envMapper.selectByPrimaryKey(id);
		
	}

}
