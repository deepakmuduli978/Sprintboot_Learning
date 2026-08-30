package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CT")
public class chat implements Message{
    @Override
    public void mess(){
        System.out.println("How are you this is chart message.");
    }
    @Override
    public void alert(){
        System.out.println("Be Care full about spam char.");
    }
}
