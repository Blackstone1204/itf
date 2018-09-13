package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlanMapper;
import com.dao.TargetMapper;
import com.model.Plan;
import com.model.Target;
import com.service.IPlanService;
@Service
public class PlanService implements IPlanService {
	
	@Autowired
	PlanMapper planMapper;
	@Autowired
	TargetMapper targetMapper;

	@Override
	public void addPlan(Plan plan) {
		// TODO Auto-generated method stub
		planMapper.insert(plan);
		
	}

	@Override
	public void delPlanById(String id) {
		// TODO Auto-generated method stub
		planMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updatePlan(Plan plan) {
		// TODO Auto-generated method stub
		
		planMapper.updateByPrimaryKey(plan);
		
	}

	@Override
	public List<Plan> queryPlanById(String id) {
		// TODO Auto-generated method stub
		return planMapper.selectByPrimaryKey(id);
	}

	@Override
	public void carryOut(String id) {
		// TODO Auto-generated method stub
		List<String> list=planMapper.selectTargetById(id);
		for(String tid:list){
			Target t=targetMapper.selectByPrimaryKey(tid);
			
		}
		
	}

}
