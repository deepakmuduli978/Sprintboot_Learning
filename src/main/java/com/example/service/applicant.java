package com.example.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="details")
public class applicant {

    private String name;
    private String rollno;
    private int fees;
    private String mob;

    public void setName(String name){
        this.name=name;
    }
    public void setRollno(String rollno){
        this.rollno=rollno;
    }
    public void setFees(int fees){
        this.fees=fees;
    }
    public void setMob(String mob){
        this.mob=mob;
    }
    public void run(){
        System.out.println("The value of all applicant.");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("Fees:"+fees);
        System.out.println("Mob no:"+mob);
    }
}
