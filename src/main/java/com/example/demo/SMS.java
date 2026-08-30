package com.example.demo;

import com.example.demo.controller.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SMS {
    public Message ms;

    public SMS(@Qualifier("CT")Message ms){
        this.ms=ms;
    }
    public void sms(){
        System.out.println("Hello You are confirmed ticket.");
        ms.mess();
        ms.alert();
    }
}
