package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("NOT")
public class Notification implements Message {
    @Override
    public void mess(){
        System.out.println("This is a message to you.");
    }
    @Override
    public void alert(){
        System.out.println("Be Care full about spam message.");
    }
}
