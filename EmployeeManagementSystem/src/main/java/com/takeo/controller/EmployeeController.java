package com.takeo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.entity.Employee;
import com.takeo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController
{
	@Autowired
	private EmployeeService empService ;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return empService.saveEmployee(emp);
	}
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return empService.getAllEmployee();
	}
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable long id)
	{
		return empService.getEmployeeById(id);
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee)
	{
		return empService.updateEmployee(id, employee);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable long id)
	{
		empService.deleteEmployee(id);
		
	}
			
}
