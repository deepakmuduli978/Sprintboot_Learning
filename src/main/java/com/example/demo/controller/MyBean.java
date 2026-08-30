package com.example.demo.controller;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean implements BeanNameAware {
    public MyBean(){
        System.out.println("1.bean is Created");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("This bean name is "+name);
    }
}
