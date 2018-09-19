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

/**
 * 
 * @author 97140
 *树菜单部分的结构组成
 */
public class Node extends Target{
	
	@Autowired DirectiveService driectiveService;
	
	private String ext;//计划case parent路径描述
	
	private List<Node> children=new ArrayList<Node>();
	private List<ParamInfo> params=new ArrayList<ParamInfo>();	
	private List<Directive> directives=new ArrayList<Directive>();
	
	
	
	public static Node fromTarget(Target t){
		
		return fromTarget(t,null,null);
		
	}
	

	public static Node fromTarget(Target t,List<ParamInfo>params,List<Directive>directives){
		Node node=new Node();
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
	
	public static List<Node> fromTarget(List<Target> list){
		List<Node> nodes=new ArrayList<Node>();
		for(Target t:list){
			nodes.add(fromTarget(t));
			
		}
		
		return nodes;
	}
	
	public void addChild(Node node){
		this.children.add(node);
		
	}
	
	public void setChild(List<Node> children){
		this.children=children;
		
	}
	
	public List<Node> getChild(){
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
