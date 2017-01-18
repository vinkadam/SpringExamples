package com.example.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:**/*spring-dispatcher-servlet.xml");

    	Customer cust = (Customer)context.getBean("BaseCustomerMalaysia");
    	System.out.println(cust);
    	
    }
}
