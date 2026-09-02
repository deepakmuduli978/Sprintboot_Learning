package com.example.demo;


import com.example.demo.controller.userPayment;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.controller")

public class AppConfig {
//    @Bean(value = "userpayment",initMethod = "start")
//    public userPayment pay(){
//        System.out.println("UserPayment object creation start");
//        return new userPayment();
//    }

    @PostConstruct
    public void start(){
        System.out.println("This is the AppConfig Methods");
    }
    @PreDestroy
    public void clean(){
        System.out.println("ALl the Beans in appConfig Destroyed");
    }

}
