package com.hello;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

   
    public void drive() {
        System.out.println("Im using Tesla Model S driving to Tokyo");
        
    }
    
}
