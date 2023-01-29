package com.takeo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String email;
	private int d_id;
	
	
	public Employee() {
		super();
	
	}
	public Employee(int eid, String ename, String email, int d_id) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.d_id = d_id;
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
	@Column(name ="d_id")
	public int getDept() {
		return d_id;
	}
	public void setDept(int dno) {
		this.d_id = dno;
	}
	
	
	
	
	

}
