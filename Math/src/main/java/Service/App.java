package Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CalculatorService obj = (CalculatorService) context.getBean("helloWorld");
        int a=15;
        int b=10;
        int aadd= obj.add(a,b);
        int asub=obj.sub(a, b);
        int amul=obj.mul(a, b);
        int adiv=obj.div(a, b);
        
        System.out.println("The addition of two numbers : "+aadd);
        System.out.println("The subtraction of two numbers : "+asub);
        System.out.println("The multliplication of two numbers : "+amul);
        System.out.println("The division of two numbers : "+adiv);
        
        
    }
}
