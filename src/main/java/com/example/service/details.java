package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class details implements ApplicationRunner {
    private final String name;
    private final String rollno;
//    private final int fees;
//    private final int mob;
    public details(@Value("${details.name}" )String name, @Value("${details.roll-no}")String rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is the details of the java class.");
        System.out.println("The Name of the user:"+name);
        System.out.println("The Roll no of the user:"+rollno);
    }
}
