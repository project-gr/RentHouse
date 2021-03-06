/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.bean;

/**
 *
 * @author Ren
 */
public class Student {

    private String studentID;
    private String studentName;
    private String studentPhone;
    private String studentMail;
    private int studentStatus;

    public Student() {
    }

    public Student(String studentID, String studentName, String studentPhone, String studentMail, int studentStatus) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentMail = studentMail;
        this.studentStatus = studentStatus;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public int getStudentStatus() {
        return studentStatus;
    }

    public String getStatus() {
        String status = "";
        if (studentStatus == 0) {
            status += "Available";
        } else {
            status += "Rented";
        }
        return status;
    }

    public void setStudentStatus(int studentStatus) {
        this.studentStatus = studentStatus;
    }

}
