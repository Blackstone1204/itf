package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ResultMapper;
import com.model.Result;
import com.service.IResultService;
@Service
public class ResultService implements IResultService {

	@Autowired 
	ResultMapper resultMapper;
	@Override
	public void addResult(Result res) {
		// TODO Auto-generated method stub
		
		resultMapper.insert(res);

	}

	@Override
	public void delResultById(String id) {
		// TODO Auto-generated method stub
		resultMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void updateResult(Result res) {
		// TODO Auto-generated method stub
		resultMapper.updateByPrimaryKey(res);

	}

	@Override
	public List<Result> queryResultByPlanId(String planId) {
		// TODO Auto-generated method stub
		return resultMapper.selectByPlanId(planId);
	}

}
