package Service;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorService {
  private MathService mathservice;
  
@Autowired
public void setMathservice(MathService mathservice) {
	this.mathservice = mathservice;
}
public int add(int a,int b) {
	return mathservice.addition(a, b);
}
public int sub(int a, int b) {
	return mathservice.subtraction(a, b);
}
public int mul(int a,int b) {
	return mathservice.multliplication(a, b);
}
public int div(int a,int b) {
	return mathservice.division(a, b);
}
}
