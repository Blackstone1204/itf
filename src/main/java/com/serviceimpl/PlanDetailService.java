package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlanDetailMapper;
import com.dao.TargetMapper;
import com.model.PlanDetail;
import com.model.Target;
import com.service.IPlanDetailService;
@Service
public class PlanDetailService implements IPlanDetailService {
	
	@Autowired
	PlanDetailMapper planMapper;
	@Autowired
	TargetMapper targetMapper;

	@Override
	public void addPlan(PlanDetail plan) {
		// TODO Auto-generated method stub
		planMapper.insert(plan);
		
	}

	@Override
	public void delPlanById(String id) {
		// TODO Auto-generated method stub
		planMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updatePlan(PlanDetail plan) {
		// TODO Auto-generated method stub
		
		planMapper.updateByPrimaryKey(plan);
		
	}

	@Override
	public List<PlanDetail> queryPlanById(String id) {
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
