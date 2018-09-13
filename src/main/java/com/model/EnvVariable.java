package com.model;

public class EnvVariable {
    private String id;

    private String key;

    private String value;

    private String envId;
    
    private String isDelete;

    public EnvVariable(String id, String key, String value, String envId,String isDelete) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.envId = envId;
    }

    public EnvVariable() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId == null ? null : envId.trim();
    }

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
}