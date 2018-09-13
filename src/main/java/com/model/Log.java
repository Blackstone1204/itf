package com.model;

public class Log {
    private String id;

    private String accoutId;

    private String msg;

    public Log(String id, String accoutId, String msg) {
        this.id = id;
        this.accoutId = accoutId;
        this.msg = msg;
    }

    public Log() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccoutId() {
        return accoutId;
    }

    public void setAccoutId(String accoutId) {
        this.accoutId = accoutId == null ? null : accoutId.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}