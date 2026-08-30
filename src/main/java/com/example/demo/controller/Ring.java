package com.example.demo.controller;

public class Ring implements Message{
    @Override
    public void mess(){
        System.out.println("Are you intrested to set this rington.");
    }
    @Override
    public void alert(){
        System.out.println("Be Care full about spam rington.");
    }
}
