package com.service;

import java.util.List;

import com.model.Directive;

public interface IDirectiveService {
	public List<Directive> queryByTargetId(String targetId);
	public void updateOneDirective(Directive directive);
	public void updateTargetDirective(List<Directive> list);
	public void addOneDirective(Directive directive);
	public void addTargetDirective(List<Directive> list);
	public void removeAllByTargetId(String targetId);

}
