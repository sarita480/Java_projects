package com.takeo.model;

import java.util.List;
import java.util.Set;

import lombok.Setter;
//@Data
//@allArgument or noargument for constructor
@Setter
public class InstituteBean
{
	private String name;
	private List<String>facultyNames;
	private Set<String> courseNames;
	public void display()
	{
		System.out.println("Faculty Names: ");
		System.out.println("**************");
		for(String name: facultyNames)
		{
			System.out.println(name);
			
			
		}
		System.out.println("Course Names: ");
		System.out.println("**************");
		for(String course: courseNames)
		{
			System.out.println(course);
		}
	}

}
