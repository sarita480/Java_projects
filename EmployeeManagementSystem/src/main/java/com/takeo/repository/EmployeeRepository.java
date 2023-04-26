package com.takeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.takeo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	

}
