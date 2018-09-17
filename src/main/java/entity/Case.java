package entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DirectiveMapper;
import com.dao.ParamInfoMapper;
import com.model.Directive;
import com.model.ParamInfo;
import com.model.Target;
import com.serviceimpl.DirectiveService;
import com.utils.Dispatcher;

public class Case extends Target{
	
	@Autowired DirectiveService driectiveService;
	
	private String ext;//计划case parent路径描述
	
	private List<Case> children=new ArrayList<Case>();
	private List<ParamInfo> params=new ArrayList<ParamInfo>();	
	private List<Directive> directives=new ArrayList<Directive>();
	
	
	
	public void dispatch(){
		System.out.println(String.format("%s=>执行请求操作", this.getId()));
		
	}
	
	public void before(){
		System.out.println(String.format("%s=>执行前置", this.getId()));
		
		
		
	}
	
	public void after(){
		System.out.println(String.format("%s=>执行后置", this.getId()));
		List<Directive> directives=driectiveService.queryByTargetId(this.getId());
		for(Directive directive:directives){
			String info=directive.getInfo();
			System.out.println(String.format("%s=>执行后置=>%s", this.getId(),info));
			Dispatcher.dispatch(directive.getInfo(), Dispatcher.getMap());
		}
		
	}
	

	
	public static Case fromTarget(Target t){
		
		return fromTarget(t,null,null);
		
	}
	

	public static Case fromTarget(Target t,List<ParamInfo>params,List<Directive>directives){
		Case node=new Case();
		node.setId(t.getId());
		node.setAccountId(t.getAccountId());
		node.setDomain(t.getDomain());
		node.setLev(t.getLev());
		node.setTitle(t.getTitle());
		node.setParentId(t.getParentId());
		node.setUrl(t.getUrl());
		node.setIsDir(t.getIsDir());
		node.setIsDelete(t.getIsDelete());
		node.setMethod(t.getMethod());
		node.setParams(params);
		node.setDirectives(directives);
		return node;
		
	}
	
	public static List<Case> fromTarget(List<Target> list){
		List<Case> nodes=new ArrayList<Case>();
		for(Target t:list){
			nodes.add(fromTarget(t));
			
		}
		
		return nodes;
	}
	
	public void addChild(Case node){
		this.children.add(node);
		
	}
	
	public void setChild(List<Case> children){
		this.children=children;
		
	}
	
	public List<Case> getChild(){
		return children;
	}
	
	
	public List<ParamInfo> getParams() {
		return params;
	}

	public void setParams(List<ParamInfo> params) {
		this.params = params;
	}

	public List<Directive> getDirectives() {
		return directives;
	}

	public void setDirectives(List<Directive> directives) {
		this.directives = directives;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

}
