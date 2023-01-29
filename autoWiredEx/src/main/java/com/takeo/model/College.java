package com.takeo.model;

import java.util.List;

public class College
{
	private String name;
	private List<Student>slist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
	

}
