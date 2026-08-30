package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("NN")
public class Notice implements Message {
    @Override
    public void mess(){
        System.out.println("Important notice to you.");
    }
    @Override
    public void alert(){
        System.out.println("Be Care full about spam Notice.");
    }
}
