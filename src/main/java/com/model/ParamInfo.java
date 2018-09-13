package com.model;

public class ParamInfo {
    private String id;

    private String targetId;

    private String k;

    private String v;

    private String isDelete;

    public ParamInfo(String id, String targetId, String k, String v, String isDelete) {
        this.id = id;
        this.targetId = targetId;
        this.k = k;
        this.v = v;
        this.isDelete = isDelete;
    }

    public ParamInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    public String getK() {
        return k;
    }

    public void setK(String key) {
        this.k = k== null ? null : k.trim();
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v= v == null ? null : v.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}