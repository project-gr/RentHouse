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
public class StaffInfo {
    
    private String staffID;
    private String staffName;
    private String staffPhone;
    private String staffMail;

    public StaffInfo() {
    }

    public StaffInfo(String staffID, String staffName, String staffPhone, String staffMail) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffPhone = staffPhone;
        this.staffMail = staffMail;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffMail() {
        return staffMail;
    }

    public void setStaffMail(String staffMail) {
        this.staffMail = staffMail;
    }
    
}
