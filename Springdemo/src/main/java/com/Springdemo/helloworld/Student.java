package com.Springdemo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;



public class Student {
	int stno;
	String sname;
	double savg;
	
	Address add;
	@Autowired
	public Student(Address add){
		this.add=add;
	}
	public Student(int stno, String sname, double savg) {
		super();
		this.stno = stno;
		this.sname = sname;
		this.savg = savg;
	}
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getStno() {
		return stno;
	}

	public void setStno(int stno) {
		this.stno = stno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSavg() {
		return savg;
	}

	public void setSavg(double savg) {
		this.savg = savg;
	}

	void display() {
		System.out.println(stno+sname+savg);
		add.aDisplay();
	}

	
	

}
