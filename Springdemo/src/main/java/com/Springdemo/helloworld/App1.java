package com.Springdemo.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Emp obj = (Emp) context.getBean("vinay");
        
        /*obj.setId(10);
        obj.setName("vinay");
        obj.setCity("vijayawada");*/
        obj.display();
	}

}
