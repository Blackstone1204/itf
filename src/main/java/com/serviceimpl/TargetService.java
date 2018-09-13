package com.serviceimpl;

import io.jsonwebtoken.lang.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TargetMapper;
import com.model.Target;
import com.service.ITargetService;

import entity.Case;
@Service
public class TargetService implements ITargetService {

	@Autowired
	TargetMapper targetMapper;


	@Override
	public List<Case> queryAll() {
		// TODO Auto-generated method stub
	
		List<Case> chainNodes=new ArrayList<Case>();
		List<Target> chains=new ArrayList<Target>();
		List<Target> all = targetMapper.selectTopChildren();
		for(Target t:all){
			chainNodes.add(getChain(t));
		
		}

		return chainNodes;
	}

	@Override
	public List<Target> querySub(String parentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Target> queryChildren(String id) {
		// TODO Auto-generated method stub
		return targetMapper.selectChildren(id);
	}
	
	private Case getChain(Target t){
		Case root=Case.fromTarget(t);
		toNodeChain(root);
		
		return root;	
	
	}

	private void  toNodeChain(Case start) {
	
		List<Target> list=targetMapper.selectChildren(start.getId());
		List<Case> cns=Case.fromTarget(list);
		
		if(cns.size()<1)return;
		else{
		
			start.setChild(cns);
			
		}
		//
		
		for(Case cn:cns){
			toNodeChain(cn);
			
		}


	}

	@Override
	public List<Target> queryTopChildren() {
		// TODO Auto-generated method stub
		return targetMapper.selectTopChildren();
	}

	@Override
	public void add(Target target) {
		// TODO Auto-generated method stub
		targetMapper.insert(target);
	}

	@Override
	public void del(String id) {
		// TODO Auto-generated method stub
		//targetMapper.deleteByPrimaryKey(id);
		Set<String> set=new HashSet<String>();
		delChainNode(set,id);
		System.out.println(StringUtils.join(set.toArray()," "));
		for(String tid:set){
			targetMapper.deleteByPrimaryKey(tid);
			
		}
		
		
	}
	

	private void delChainNode(Set<String> delSet,String id){
		
		
		System.out.println(String.format("分析链式关系id=%s",id));
		
		delSet.add(id);
		List<Target> children=this.queryChildren(id);
		int size=children.size();
		
		System.out.println(String.format("id=%s 子集大小=%s", id,size));
		
		if(size>0){
			for(Target target:children){
				delSet.add(target.getId());
				delChainNode(delSet,target.getId());
				
			}

	
			
		}
	
			
		

		
	}

	@Override
	public void update(Target target) {
		// TODO Auto-generated method stub
		targetMapper.updateByPrimaryKey(target);
	}

}
