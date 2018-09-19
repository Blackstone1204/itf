package com.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlanDetailMapper;
import com.dao.TargetMapper;
import com.model.PlanDetail;
import com.model.Target;
import com.service.IPlanDetailService;

import entity.Response;
@Service
public class PlanDetailService implements IPlanDetailService {
	
	@Autowired
	PlanDetailMapper planDetailMapper;
	@Autowired
	TargetMapper targetMapper;

	@Override
	public void addOneDetail(PlanDetail plan) {
		// TODO Auto-generated method stub
		planDetailMapper.insert(plan);
		
	}

	@Override
	public void delOneDetailById(String id) {
		// TODO Auto-generated method stub
		planDetailMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateOneDetail(PlanDetail plan) {
		// TODO Auto-generated method stub
		
		planDetailMapper.updateByPrimaryKey(plan);
		
	}
	
	public void updateDetails(List<PlanDetail> list){
		for(PlanDetail pd:list){
			this.updateOneDetail(pd);

		}
		
	}

	@Override
	public List<PlanDetail> queryOneDetailById(String id) {
		// TODO Auto-generated method stub
		return planDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public void carryOut(String id) {
		// TODO Auto-generated method stub

		
	}
	
	@Override
	public void carryOut(List<String> listID) {
		// TODO Auto-generated method stub
		
		for(String id:listID){
			this.carryOut(id);
		}
		
	}

	@Override
	public List<PlanDetail> queryAllByPlanId(String planId) {
		// TODO Auto-generated method stub
		
		return planDetailMapper.selectAllByPlanId(planId);
	}





}
