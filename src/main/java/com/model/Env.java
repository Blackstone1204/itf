package com.model;

public class Env {
    private String id;

    private String envName;

    private String isDelete;

    public Env(String id, String envName, String isDelete) {
        this.id = id;
        this.envName = envName;
        this.isDelete = isDelete;
    }

    public Env() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName == null ? null : envName.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}