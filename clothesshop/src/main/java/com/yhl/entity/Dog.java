package com.yhl.entity;

public class Dog {

    private String dogId;

    private String dogName;

    private Integer dogAge;

    public String getDogId() {
        return dogId;
    }

    public void setDogId(String dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", dogAge="
                + dogAge + "]";
    }


}
