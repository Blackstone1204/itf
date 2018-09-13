package com.service;

import java.util.List;

import com.model.GlobalVariable;

public interface IGlobalVariableService {
	
	public void addGlobal(GlobalVariable globalVariable);
	public void removeGlobal(String id);
	public void updateGlobal(GlobalVariable globalVariable);
	public List<GlobalVariable> queryAll();

}
