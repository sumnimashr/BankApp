package com.abc.myproject.vo;


public class PhoneSaveObject {
    String name;
    String brand;
    String size;

    public PhoneSaveObject() {
    }

    public PhoneSaveObject(String name, String brand, String size) {
        this.name = name;
        this.brand = brand;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
