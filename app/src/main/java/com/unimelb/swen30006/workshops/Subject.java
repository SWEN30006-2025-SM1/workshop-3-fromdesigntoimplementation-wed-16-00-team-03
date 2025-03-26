package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Subject {
    String name;
    String subjectCode;
    public Subject(String name, String subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }
    public void createAss() {
        Assignment a = Assignment.create();
    }

    public void deleteAss(String name) {

    }
}
