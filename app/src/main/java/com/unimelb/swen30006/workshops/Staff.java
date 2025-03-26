package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person {
    String[] roles;
    String staffID;
    ArrayList<Subject> teachingSubjects;
    public Staff(String address, Date dob, String name, String[] roles, String staffID) {
        super(address, dob, name);
        this.roles = roles;
        this.staffID = staffID;
    }


}
