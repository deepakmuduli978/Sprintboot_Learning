package com.example.demo;

import com.example.configure.ApplicationConfig;
import com.example.demo.controller.Message;
import com.example.demo.controller.Notification;
import com.example.demo.controller.Ring;
import com.example.demo.controller.chat;
import com.example.demo.controller.userPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
//		Message dm=new Ring();
//		SMS s=new SMS(dm);
//		s.sms();
//		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        SMS O=context.getBean(SMS.class);
		O.sms();
		userPayment pay=context.getBean("userpayment",userPayment.class);
		pay.payment();
	}

}
