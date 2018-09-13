package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DirectiveMapper;
import com.model.Directive;
import com.service.IDirectiveService;

@Service
public class DirectiveService implements IDirectiveService{
	@Autowired
	DirectiveMapper directiveMapper;

	@Override
	public List<Directive> queryByTargetId(String targetId) {
		// TODO Auto-generated method stub
		return directiveMapper.selectByTargetId(targetId);
		
	}

	@Override
	public void updateOneDirective(Directive directive) {
		// TODO Auto-generated method stub
		directiveMapper.updateByPrimaryKey(directive);
		
	}

	@Override
	public void updateTargetDirective(List<Directive> list) {
		// TODO Auto-generated method stub
		
		for(Directive d:list){
			this.updateOneDirective(d);
			
		}
		
	}

	@Override
	public void addOneDirective(Directive directive) {
		// TODO Auto-generated method stub
		directiveMapper.insert(directive);
		
	}

	@Override
	public void addTargetDirective(List<Directive> list) {
		// TODO Auto-generated method stub
		
		for(Directive d:list){
			this.addOneDirective(d);
		}
		
	}

	@Override
	public void removeAllByTargetId(String targetId) {
		// TODO Auto-generated method stub
		directiveMapper.deleteByTargetId(targetId);
		
	}

}
