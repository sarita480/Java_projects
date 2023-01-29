package com.takeo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@NamedQuery(name ="find_all", query="from Employee")

public class Employee 
{
	@Id
	@Column(name="eid")
	private int eid;
	@Column (name="ename")
	private String ename;
	@Column(name="email")
	private String email;
	@Column(name="eadd")
	private String eadd;
	
	public Employee() 
	{
		
	}
	
	public Employee(int eid, String ename, String email, String eadd)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.eadd = eadd;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
