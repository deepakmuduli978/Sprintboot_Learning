package com.example.demo.controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class items {
    String item1="Chicken";
    String item2="Prawn";
    String item3="Crabs";
    String item4="Mutton";
    public void prepare(){
        System.out.println("Preparation is going one please wait.");
    }
    @PostConstruct
    public void start(){
        System.out.println("items object are injected. This is postconstruct method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Now all beans works are completed need to destroy it.");
    }
}
