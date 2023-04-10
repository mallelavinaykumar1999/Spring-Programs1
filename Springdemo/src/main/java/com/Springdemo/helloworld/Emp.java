package com.Springdemo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private int id;
	private String name;
	private String city;
	private Address add;
	private Question qa;
	
	
	public Address getAdd() {
		return add;
	}
	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}
	public Question getQa() {
		return qa;
	}
	@Autowired
	public void setQa(Question qa) {
		this.qa = qa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	void display() {
		System.out.println("id : "+id+"\n"+"name : "+name+"\n"+"city : "+city+" " );
		add.aDisplay();
		/*System.out.println(q.getQid());*/
		qa.Display();
		
	}
	
}
