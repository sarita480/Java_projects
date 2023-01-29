package com.takeo.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="department")
public class Department
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dno;
	private String dname;
	private String location;
	
	
	public Department() {
		super();
		
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "d_id")
	
	private List<Employee> elist;
	
	
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	public Department(int dno, String dpname, String location) {
		super();
		this.dno = dno;
		this.dname = dpname;
		this.location = location;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDpname() {
		return dname;
	}
	public void setDpname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
