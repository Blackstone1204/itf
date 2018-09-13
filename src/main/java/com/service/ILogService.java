package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.LogMapper;
import com.model.Log;

public interface ILogService {
	
	
	public void addLog(Log log);
	
	public void removeLog(String id);
	
	
	public void updateLog(Log log);
	
	public List<Log> queryOne(String id);
	
	public List<Log> queryAll();

}
