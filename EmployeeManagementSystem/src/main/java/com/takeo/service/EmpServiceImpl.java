package com.takeo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.takeo.entity.Employee;
import com.takeo.repository.EmployeeRepository;
@Service
public class EmpServiceImpl implements EmployeeService
{
	@Autowired
	private  EmployeeRepository emprepo;

	@Override
	public Employee saveEmployee(Employee employee)
	{
		return emprepo.save(employee);
	
		
	}

	@Override
	public Optional<Employee> getEmployeeById(long id)
	{
		Optional<Employee> empEntity = emprepo.findById(id);
		if(empEntity.isPresent())
		{
			empEntity.get();
		}
		else
		{
			throw new RuntimeException("Object does not exist");
		}
		
		return empEntity;
	}

	@Override
	public List<Employee> getAllEmployee()
	{
		
		return emprepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	@Override
	public Employee updateEmployee(long id, Employee employee)
	{
	
		Employee updateEmp = emprepo.findById(id).orElseThrow();
		updateEmp.setFirstName(employee.getFirstName());
		updateEmp.setLastName(employee.getLastName());
		updateEmp.setEmail(employee.getEmail());
		return emprepo.save(updateEmp);
	}

	@Override
	public void deleteEmployee(long id) 
	{
		emprepo.deleteById(id);
		
	}
	

}
