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
import com.utils.IdGenerator;

import entity.Response;
@Service
public class PlanDetailService implements IPlanDetailService {
	
	@Autowired
	PlanDetailMapper planDetailMapper;
	@Autowired
	TargetMapper targetMapper;
	
	@Autowired IdGenerator gen;

	@Override
	public void addDetail(PlanDetail planDetail) {
		// TODO Auto-generated method stub
		//planDetailMapper.insert(plan);
		String planId=planDetail.getPlanId();
		String targetId=planDetail.getTargetId();
		Target target=targetMapper.selectByPrimaryKey(targetId);
		String type=target.getIsDir();
		
		System.out.println(String.format("新增计划=>planID=%s targetId=%s type=%s", planId,targetId,type));
		
		
		if("1".equals(type)){
			List<Target> list=targetMapper.selectChildren(targetId);
			for(Target item:list){
				String title=item.getTitle();
				PlanDetail pd=new PlanDetail();
				pd.setTitle(title);
				pd.setPlanId(planId);
				pd.setTargetId(item.getId());
				pd.setStep("");
				pd.setId(gen.getMd5Id());
				planDetailMapper.insert(pd);
					
			}
			
		}else{
			PlanDetail pd=new PlanDetail();
			pd.setId(gen.getMd5Id());
			pd.setTitle(target.getTitle());
			pd.setPlanId(planId);
			pd.setTargetId(target.getId());
			pd.setStep("");
			planDetailMapper.insert(pd);
			
		}
		
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
