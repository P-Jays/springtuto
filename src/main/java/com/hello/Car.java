package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Autowired
    Tyre tyre;

    public Tyre getTyre() {
        return this.tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    
    public void drive() {
        System.out.println("Im using Tesla Model S driving to Tokyo " +getTyre());
        // to get the tyre , we need to create component to tyre class
    }
    
}
