package Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class App {
   public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       OrderService obj = (OrderService) context.getBean("helloWorld");
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your option(placeorder/cancelorder)");
       String s=sc.next();
       /*obj.setStno(10);
       obj.setSname("vinay");
       obj.setSavg(75.60);*/
       if(s.equalsIgnoreCase("placeorder")) {
       obj.placeOrder();
       obj.processPayment();
       }
       else if(s.equalsIgnoreCase("cancelorder")) {
       obj.cancelOrder();
       obj.processPayment();
       }
    }
}
