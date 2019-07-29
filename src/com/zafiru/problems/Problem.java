package com.zafiru.problems;

public abstract class Problem {

    private int id;
    private String description;

    public Problem(int id, String description){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String answer();
}
