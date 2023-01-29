package com.takeo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee 
{
	@Id
	private int id;
	private String ename;
	private String email;
	private String eadd;
	public Employee()
	{
		
	}
	public int getEid() 
	
	{
		return id;
	}
	public Employee(int id, String ename, String email, String eadd) {
		super();
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.eadd = eadd;
	}
	public void setEid(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	
}
