package com.Springdemo.helloworld;

public class Address {
  private String street,city,state,country;

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}
public void aDisplay(){  
    System.out.println("Street : "+street+"\n"+"city : "+city+"\n"+"State : "+state+"\n"+"country : "+country);  
}  
}
