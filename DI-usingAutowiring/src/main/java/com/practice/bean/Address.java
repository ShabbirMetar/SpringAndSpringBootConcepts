package com.practice.bean;

public class Address {
    private int houseNo;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}
