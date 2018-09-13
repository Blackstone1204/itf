package com.model;

import entity.Piper;

public class Target extends Piper {
    private String id;

    private String title;

    private String domain;

    private String url;

    private String parentId;

    private String lev;

    private String accountId;

    private String method;

    private String isDir;

    private String isDelete;
    
    private String createTime;
    private String updateTime;

    public Target(String id, String title, String domain, String url, String parentId, String lev, String accountId, String method, String isDir, String isDelete,String createTime,
    String updateTime) {
        this.id = id;
        this.title = title;
        this.domain = domain;
        this.url = url;
        this.parentId = parentId;
        this.lev = lev;
        this.accountId = accountId;
        this.method = method;
        this.isDir = isDir;
        this.isDelete = isDelete;
    }

    public Target() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getLev() {
        return lev;
    }

    public void setLev(String lev) {
        this.lev = lev == null ? null : lev.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getIsDir() {
        return isDir;
    }

    public void setIsDir(String isDir) {
        this.isDir = isDir == null ? null : isDir.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

	@Override
	public void before() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void after() {
		// TODO Auto-generated method stub
		
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}