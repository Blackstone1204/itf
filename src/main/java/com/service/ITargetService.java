package com.service;

import java.util.List;

import com.model.Target;

import entity.Case;

public interface ITargetService {
	
	public List<Case> queryAll();
	
	public List<Target> querySub(String parentId);
	
	public List<Target> queryChildren(String id);
	
	public List<Target> queryTopChildren();
	
	public void add(Target target);
	
	public void del(String id);
	
	public void update(Target target);

}
