package com.sukiga.todolist.model;

public class Task {

    private String description;
    private boolean completed;
    
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public void changeDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCompleted() {
        this.completed = !(this.completed);
    }

    public boolean isCompleted() {
        return this.completed;
    }


}
