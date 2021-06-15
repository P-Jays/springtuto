package com.hello;

public class Tyre {
    private String brand;


    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "{" +
            " brand='" + getBrand() + "'" +
            "}";
    }

}
