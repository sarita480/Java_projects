package com.takeo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.takeo.StudentEntity.StudentEntity;
import com.takeo.model.Student;

@Service

public interface StudentService 
{
	public boolean saveStudent(Student student);
	public List<Student> getAllStudents();
	public StudentEntity getStudentById(int id);
	public Boolean updateStudent(StudentEntity stu);
	public void deleteStudent(int id);

}
