package com.example.demo;

import com.example.configure.ApplicationConfig;
import com.example.demo.controller.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages="com.example.service")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
//		Message dm=new Ring();
//		SMS s=new SMS(dm);
//		s.sms();
//		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        SMS O=context.getBean(SMS.class);
//		O.sms();
//		userPayment pay=context.getBean("userpayment",userPayment.class);
//		pay.payment();
//
//		orderplaced odr=context.getBean(orderplaced.class);
//		odr.order();
//		orderplaced odr1=context.getBean(orderplaced.class);
//		System.out.println(odr==odr1);

//		MyBean bean=context.getBean("myBean",MyBean.class);
//		bean.setBeanName("Deepak");

	}

}
