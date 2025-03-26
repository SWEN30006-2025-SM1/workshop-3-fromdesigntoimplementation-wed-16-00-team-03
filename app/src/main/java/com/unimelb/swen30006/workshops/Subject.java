package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Subject {
    String name;
    String subjectCode;
    ArrayList<Assignment> allAss = new ArrayList<>();

    public Subject(String name, String subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }
    public void createAss() {
        allAss.add(Assignment.create());
    }

    public void deleteAss(String name) {
        for (Assignment a: allAss) {
            if (a.getName() == name) {
                allAss.remove(name);
                return;
            }
        }
    }
}
