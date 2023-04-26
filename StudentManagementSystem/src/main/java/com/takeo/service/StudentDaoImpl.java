package com.takeo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.takeo.StudentEntity.StudentEntity;
import com.takeo.model.Student;
import com.takeo.repo.StudentRepo;
@Component
public class StudentDaoImpl implements StudentService
{
	@Autowired
	private StudentRepo stu;

	@Override
	public boolean saveStudent(Student student)
	{
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties("student", entity);
		StudentEntity s  = stu.save(entity);
		boolean flag = false;
		
		if(s != null)
		{
			System.out.println("Object is inserted Successfully.");
			flag = true;
		}
		
		return flag;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateStudent(StudentEntity stu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
