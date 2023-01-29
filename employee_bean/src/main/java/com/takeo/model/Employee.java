package com.takeo.model;

public class Employee 
{
	private int eno;
	private String ename;
	
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	
	}
	private double sal;
	private String city;
	public Employee(double sal, String city) {
		super();
		this.sal = sal;
		this.city = city;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	
	public double getSal() {
		return sal;
	}
	public String getCity() {
		return city;
	}
	
	

}
