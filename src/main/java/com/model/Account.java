package com.model;

public class Account {
    private String id;

    private String account;

    private String password;

    private String accountName;

    private String roleId;

    private String isDelete;

    public Account(String id, String account, String password, String accountName, String roleId, String isDelete) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.accountName = accountName;
        this.roleId = roleId;
        this.isDelete = isDelete;
    }

    public Account() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
    public String toString(){
    	return String.format("{id=%s,account=%s,accountName=%s,roleId=%s}", this.getId(),this.getAccount(),this.getAccountName(),this.getRoleId());
    }
}