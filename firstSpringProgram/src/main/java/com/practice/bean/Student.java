package com.practice.bean;
// Student is a POJO class having
//3 fields and their getter and setter method
//we are configuring this pojo class object in resources folder and applicationContext.xml file
public class Student {
    private String name;
    private int roll;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString(){
        return "{name: " + name+"\nrollno.: "+roll+"\nemail: "+email+"}";
    }
}


