package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Staff extends Person {
    String[] roles;
    String staffID;

    public Staff(String address, Date dob, String name, String[] roles, String staffID) {
        super(address, dob, name);
        this.roles = roles;
        this.staffID = staffID;
    }


}
