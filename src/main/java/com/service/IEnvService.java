package com.service;

import com.model.Env;

public interface IEnvService {
	public void addEnv(Env env);
	public void removeEnv(String id);
	public void updateEnv(Env env);
	public void queryEnv(String id);

}
