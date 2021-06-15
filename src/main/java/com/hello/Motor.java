package com.hello;

import org.springframework.stereotype.Component;

@Component
public class Motor implements Vehicle {

   
    public void drive() {
        System.out.println("Im using Ninja 400 to Date!");
    }
    
}
