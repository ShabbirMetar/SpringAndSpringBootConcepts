package com.practice.bean;

public class Student {
    private String name;
    private int age;
    private Address address;

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
