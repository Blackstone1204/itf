package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlanDetailMapper;
import com.dao.PlanMapper;
import com.model.Plan;
import com.service.IPlanService;
@Service
public class PlanService implements IPlanService {

	@Autowired 
	PlanMapper planMapper;
	@Override
	public List<Plan> queryAll() {
		// TODO Auto-generated method stub
		return planMapper.selectAll();
	}

	@Override
	public void update(Plan plan) {
		// TODO Auto-generated method
		planMapper.updateByPrimaryKey(plan);

	}

	@Override
	public void add(Plan plan) {
		// TODO Auto-generated method stub
		planMapper.insert(plan);

	}

	@Override
	public List<Plan> queryByPlanId(String id) {
		// TODO Auto-generated method stub
		return planMapper.selectByPlanId(id);
	}

	@Override
	public void run(String planId) {
		// TODO Auto-generated method stub
		
	}

}
