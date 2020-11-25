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
public class HouseBean {
    
    private String houseID;
    private int houseNo;
    private String address;
    private String street;
    private String district;
    private String city;
    private boolean houseStatus;

    public HouseBean() {
    }

    public HouseBean(String houseID, int houseNo, String address, String street, String district, String city, boolean houseStatus) {
        this.houseID = houseID;
        this.houseNo = houseNo;
        this.address = address;
        this.street = street;
        this.district = district;
        this.city = city;
        this.houseStatus = houseStatus;
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(boolean houseStatus) {
        this.houseStatus = houseStatus;
    }
    
    
}
