package com.service;

import java.util.List;

import com.model.Result;

public interface IResultService {
	public void addResult(Result res);
	public void delResultById(String id);
	public void updateResult(Result res);
	public List<Result> queryResultByPlanId(String planId);

}
