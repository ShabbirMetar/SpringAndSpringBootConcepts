package com.practice.bean;

public class Address {
    private int houseNo;
    private String city;
    private int pincode;

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return "{houseNo: " + houseNo + ", city: " + city + ", pincode: " + pincode + "}";
    }
}
