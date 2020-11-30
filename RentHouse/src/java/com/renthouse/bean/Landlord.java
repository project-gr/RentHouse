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
public class Landlord {
    
    private String landlordID;
    private String landlordName;
    private String landlordPhone;
    private String landlordMail;

    public Landlord() {
    }

    public Landlord(String landlordID, String landlordName, String landlordPhone, String landlordMail) {
        this.landlordID = landlordID;
        this.landlordName = landlordName;
        this.landlordPhone = landlordPhone;
        this.landlordMail = landlordMail;
    }

    public String getLandlordID() {
        return landlordID;
    }

    public void setLandlordID(String landlordID) {
        this.landlordID = landlordID;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public String getLandlordPhone() {
        return landlordPhone;
    }

    public void setLandlordPhone(String landlordPhone) {
        this.landlordPhone = landlordPhone;
    }

    public String getLandlordMail() {
        return landlordMail;
    }

    public void setLandlordMail(String landlordMail) {
        this.landlordMail = landlordMail;
    }
    
}
