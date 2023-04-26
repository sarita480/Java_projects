package com.takeo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.StudentEntity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository <StudentEntity, Integer> 
{
	
	
	

}
