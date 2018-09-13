package com.model;

public class Result {
    private String id;

    private String planId;

    private String isSuccess;

    private String status;

    private String statusCode;

    private String data;

    private String heards;

    private String config;

    private String json;

    private String isDelete;

    public Result(String id, String planId, String isSuccess, String status, String statusCode, String data, String heards, String config, String json, String isDelete) {
        this.id = id;
        this.planId = planId;
        this.isSuccess = isSuccess;
        this.status = status;
        this.statusCode = statusCode;
        this.data = data;
        this.heards = heards;
        this.config = config;
        this.json = json;
        this.isDelete = isDelete;
    }

    public Result() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess == null ? null : isSuccess.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getHeards() {
        return heards;
    }

    public void setHeards(String heards) {
        this.heards = heards == null ? null : heards.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json == null ? null : json.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}