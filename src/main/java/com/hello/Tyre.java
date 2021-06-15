package com.hello;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;


    // this is for constructor injection
    // public Tyre(String brand) {
    //     this.brand = brand;
    // }

    public String getBrand() {
        return this.brand;
    }

      // this is for bean property
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "With this cool brand";
    }

}
