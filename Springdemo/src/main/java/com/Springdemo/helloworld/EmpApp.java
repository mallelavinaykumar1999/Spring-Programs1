package com.Springdemo.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpApp {
	 public static void main(String[] args) {
	       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent1.xml");
	        Employee obj1 = (Employee) context.getBean("helloWorld");
	        System.out.println(obj1.getName());
	        System.out.println(obj1.getMobile());
	        System.out.println(obj1.getAddress());
	        System.out.println(obj1.getRole());
	        
	    }
}s
