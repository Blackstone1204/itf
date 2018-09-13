package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AsserterMapper;
import com.model.Asserter;
import com.service.IAsserterService;
@Service
public class AsserterService implements IAsserterService{
	
	@Autowired 
	AsserterMapper asserterMapper;

	@Override
	public List<Asserter> queryAll() {
		// TODO Auto-generated method stub
		return asserterMapper.selectAll();
		
	}

}
