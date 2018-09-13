package com.model;

public class Role {
    private String id;

    private String roleName;

    private String isDelete;

    public Role(String id, String roleName, String isDelete) {
        this.id = id;
        this.roleName = roleName;
        this.isDelete = isDelete;
    }

    public Role() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}