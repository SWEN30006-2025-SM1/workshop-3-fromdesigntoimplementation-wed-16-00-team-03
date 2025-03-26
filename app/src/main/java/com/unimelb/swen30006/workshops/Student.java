package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Student extends Person {
    String email;
    String studentID;
    Double score;

    public Student(String email, String studentID, String address, Date dob, String name) {
        super(address, dob, name);
        this.email = email;
        this.studentID = studentID;
    }


    public String getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    public void sendEmailMsg(String msg) {
        System.out.println("msg");
    }

    public Double totalGrade() {
        return score;
    }

    public void updateScore(Double newScore) {
        score = newScore;
    }
}

