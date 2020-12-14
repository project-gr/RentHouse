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
public class House {
    
    private String houseID;
    private int houseNo;
    private String address;
    private String street;
    private String district;
    private String city;
    private String description;
    private String coverImage;
    private float price;
    private int houseStatus;

    public House() {
    }
    
    public House(int houseNo, String address, String street, String district, String city, String description, String coverImage, float price) {
        this.houseNo = houseNo;
        this.address = address;
        this.street = street;
        this.district = district;
        this.city = city;
        this.description = description;
        this.coverImage = coverImage;
        this.price = price;
    }

    public House(String houseID, int houseNo, String address, String street, String district, String city, String description, String coverImage, float price, int houseStatus) {
        this.houseID = houseID;
        this.houseNo = houseNo;
        this.address = address;
        this.street = street;
        this.district = district;
        this.city = city;
        this.description = description;
        this.coverImage = coverImage;
        this.price = price;
        this.houseStatus = houseStatus;
    }

    

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
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

    public int getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(int houseStatus) {
        this.houseStatus = houseStatus;
    }
}
