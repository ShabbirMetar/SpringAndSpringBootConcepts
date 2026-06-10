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
    public Address() {
        System.out.println("Inside Address default Constructor");
    }
    public Address(int houseNo, String city, int pincode) {
        System.out.println("Address parameterized Constructor");
        setHouseNo(houseNo);
        setCity(city);
        setPincode(pincode);
    }

    @Override
    public String toString(){
        return "{houseNo: " + houseNo + ", city: " + city + ", pincode: " + pincode + "}";
    }
}
