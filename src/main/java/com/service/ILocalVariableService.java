package com.service;

import java.util.List;

import com.model.EnvVariable;
import com.model.LocalVariable;

public interface ILocalVariableService {
	
	public void addLocalVariable(LocalVariable localVariable);
	public void removeByPlanId(String planId);
	public void removeById(String id);
	public void update(LocalVariable localVariable);
	public List<LocalVariable> queryByPlanId(String planId);

}
