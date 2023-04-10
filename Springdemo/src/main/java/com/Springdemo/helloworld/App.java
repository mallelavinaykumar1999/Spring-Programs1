package com.Springdemo.helloworld;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student obj = (Student) context.getBean("helloWorld");
       /*obj.setStno(10);
       obj.setSname("vinay");
       obj.setSavg(75.60);*/
       obj.display();
    }
}
