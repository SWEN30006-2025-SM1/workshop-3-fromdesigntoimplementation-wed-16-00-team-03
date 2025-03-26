package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
    String description;
    Date dueDate;
    int maxAttempts;
    String name;

    public Assignment(String description, String name, Date dueDate, int maxAttempts) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }

    public static Assignment create() {
        return new Assignment(null,null, null, 0);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public void setName(String name) {
        this.name = name;
    }
}
