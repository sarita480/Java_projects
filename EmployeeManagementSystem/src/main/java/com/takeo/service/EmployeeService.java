package com.takeo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.takeo.entity.Employee;
//@Service
public interface EmployeeService 
{
	public Employee saveEmployee(Employee employee );
	public Optional<Employee> getEmployeeById(long id);
	List<Employee>getAllEmployee();
	Employee updateEmployee(long id, Employee employee);
	void deleteEmployee(long id);
	
	

}
