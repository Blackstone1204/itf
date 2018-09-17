package com.model;

public class PlanDetail {
    private String id;

    private String targetId;

    private String step;

    private String title;
    
    private String ext;

    private String isDelete;

    public PlanDetail(String id, String targetId, String step, String title, String isDelete) {
        this.id = id;
        this.targetId = targetId;
        this.step = step;
        this.title = title;
        this.isDelete = isDelete;
    }

    public PlanDetail() {
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

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
}