package com.service;

import java.util.List;

import com.model.EnvVariable;

public interface IEnvVariableService {
	
	public void addEnvVariable(EnvVariable envVariable);
	public void removeByEnvId(String envId);
	public void removeById(String id);
	public void update(EnvVariable envVariable);
	public List<EnvVariable> queryByEnvId(String envId);
}
