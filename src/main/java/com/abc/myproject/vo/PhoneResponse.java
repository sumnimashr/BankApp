package com.abc.myproject.vo;

public class PhoneResponse {
    long id;
    String name;
    String brand;
    String size;

    public PhoneResponse(long id, String name, String brand, String size) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
    }

    public PhoneResponse() {
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
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
