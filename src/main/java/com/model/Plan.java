package com.model;

public class Plan {

	private String id;
	private String name;
	private String isDelete;
	
	public Plan(){
		super();
	}
	
	public Plan(String id,String name,String isDelete){
		this.id=id;
		this.name=name;
		this.isDelete=isDelete;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	

}
