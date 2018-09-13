package com.model;

public class Auth {
    private String id;

    private String roleId;

    private Integer canReadSelf;

    private Integer canReadOther;

    private Integer canEditSelf;

    private Integer canEditOther;

    private Integer canAddSelf;

    private Integer canAddOther;

    private Integer canDelSelf;

    private Integer canDelOther;

    private String isDelete;

    public Auth(String id, String roleId, Integer canReadSelf, Integer canReadOther, Integer canEditSelf, Integer canEditOther, Integer canAddSelf, Integer canAddOther, Integer canDelSelf, Integer canDelOther, String isDelete) {
        this.id = id;
        this.roleId = roleId;
        this.canReadSelf = canReadSelf;
        this.canReadOther = canReadOther;
        this.canEditSelf = canEditSelf;
        this.canEditOther = canEditOther;
        this.canAddSelf = canAddSelf;
        this.canAddOther = canAddOther;
        this.canDelSelf = canDelSelf;
        this.canDelOther = canDelOther;
        this.isDelete = isDelete;
    }

    public Auth() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
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

    public Integer getCanAddSelf() {
        return canAddSelf;
    }

    public void setCanAddSelf(Integer canAddSelf) {
        this.canAddSelf = canAddSelf;
    }

    public Integer getCanAddOther() {
        return canAddOther;
    }

    public void setCanAddOther(Integer canAddOther) {
        this.canAddOther = canAddOther;
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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}