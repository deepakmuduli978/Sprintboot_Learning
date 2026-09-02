package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class user implements CommandLineRunner {

    @Value("${details.name}")
    private String name;
    @Value("${details.amount:DefaultProvider}")
    private String amount;

    private applicant app;
    public user(applicant app){
        this.app=app;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("User is running and user name is "+name +" and amount is:"+amount);
        app.run();
    }
}
