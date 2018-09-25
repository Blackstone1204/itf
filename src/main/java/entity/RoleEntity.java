package entity;

public class RoleEntity {
	
	private String roleId;
	private String roleName;
	
	private Integer canReadSelf;
	private Integer canReadOther;
	private Integer canEditSelf;
	private Integer canEditOther;
	private Integer canDelSelf;
	private Integer canDelOther;
	private Integer canAddSelf;
	
	public RoleEntity(){
		
	}
	
	public RoleEntity(String roleId,String roleName,Integer canReadSelf,Integer canReadOther,Integer canEditSelf,Integer canEditOther,Integer canDelSelf,Integer canDelOther,Integer canAddSelf){
		this.roleName=roleName;
		this.roleId=roleId;
		this.canReadSelf=canReadSelf;
		this.canReadOther=canReadOther;
		this.canEditSelf=canEditOther;
		this.canDelSelf=canDelSelf;
		this.canDelOther=canDelOther;
		this.canEditSelf=canEditSelf;
		this.canEditOther=canEditOther;
	}
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getCanReadSelf() {
		return canReadSelf;
	}

	public void setCanReadSelf(Integer canReadSelf) {
		this.canReadSelf = canReadSelf;
	}

	public Integer getCanReadOther() {
		return canReadOther;
	}

	public void setCanReadOther(Integer canReadOther) {
		this.canReadOther = canReadOther;
	}

	public Integer getCanEditSelf() {
		return canEditSelf;
	}

	public void setCanEditSelf(Integer canEditSelf) {
		this.canEditSelf = canEditSelf;
	}

	public Integer getCanEditOther() {
		return canEditOther;
	}

	public void setCanEditOther(Integer canEditOther) {
		this.canEditOther = canEditOther;
	}

	public Integer getCanDelSelf() {
		return canDelSelf;
	}

	public void setCanDelSelf(Integer canDelSelf) {
		this.canDelSelf = canDelSelf;
	}

	public Integer getCanDelOther() {
		return canDelOther;
	}

	public void setCanDelOther(Integer canDelOther) {
		this.canDelOther = canDelOther;
	}

	public Integer getCanAddSelf() {
		return canAddSelf;
	}

	public void setCanAddSelf(Integer canAddSelf) {
		this.canAddSelf = canAddSelf;
	}

	
	

}
