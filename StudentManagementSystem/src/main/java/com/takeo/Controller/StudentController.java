package com.takeo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.takeo.model.Student;
import com.takeo.service.StudentDaoImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentDaoImpl daoImpl;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
//		Student student=new Student();
//		
//		model.addAttribute("student",student);
		if (userId.equals("admin") && password.equals("admin")) 
		{
			return "welcome";
		}
		model.put("errMsg", "please provide a valid user id and password");
		return "login";
	}

	
	@RequestMapping(value="/load", method=RequestMethod.GET)
	public String loadForm()
	{
		return "student";
	}
	// Model : using this can carry the data to view component
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String handleStudent(@ModelAttribute("student") Student student, Model model) {
		// interact with service layer
		// store the data into the data base

		// DTO(Data Transfer Object)
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");

		boolean flag = daoImpl.saveStudent(student);
		String msg = "";

		if (flag != false)
			msg = "Data Inserted SuccessFully";
		else
			msg = "Data Not Inserted SuccessFully";

		model.addAttribute("msg", msg);

		return "student";
	}

	@RequestMapping("/viewStudents")
	public String getViewStudents(Model model) {
		List<Student> allStudents = daoImpl.getAllStudents();

		model.addAttribute("stuRecords", allStudents);

		return "view";
	}

}
