package com.example.demo.controller;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class orderplaced {
    public items itm;

    public orderplaced(items itm){
        this.itm=itm;
    }
    public void order(){
        System.out.println(itm.item1);
        System.out.println(itm.item2);
        itm.prepare();
    }

}
