package com.example.demo;


import com.example.demo.controller.userPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.controller")

public class AppConfig {
    @Bean("userpayment")
    public userPayment pay(){
        return new userPayment();
    }

}
