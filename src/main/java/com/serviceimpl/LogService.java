package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LogMapper;
import com.model.Log;
import com.service.ILogService;
@Service
public class LogService implements ILogService {
	
	@Autowired 
	LogMapper logMapper;
	
	public void addLog(Log log){
		
		logMapper.insert(log);
	}
	
	public void removeLog(String id){
		logMapper.deleteByPrimaryKey(id);
		
	}
	
	
	public void updateLog(Log log){
		logMapper.updateByPrimaryKey(log);
		
	}
	
	public List<Log> queryOne(String id){
		
		return logMapper.selectByPrimaryKey(id);	

	}
	
	public List<Log> queryAll(){
		return logMapper.selectAll();
	}

}
