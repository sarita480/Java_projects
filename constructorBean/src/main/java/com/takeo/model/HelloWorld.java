package com.takeo.model;

public class HelloWorld 
{
	private String message;

	public HelloWorld(String message) {
		super();
		this.message = message;
	}
	public HelloWorld()
	{
		System.out.println("This is default constructor");
	}

	public void display()
	{
		System.out.println(message);
	}
	

}
