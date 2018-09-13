package com.model;

public class Asserter {
    private String id;

    private String name;

    private String deep;

    public Asserter(String id, String name, String deep) {
        this.id = id;
        this.name = name;
        this.deep = deep;
    }

    public Asserter() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeep() {
        return deep;
    }

    public void setDeep(String deep) {
        this.deep = deep == null ? null : deep.trim();
    }
}