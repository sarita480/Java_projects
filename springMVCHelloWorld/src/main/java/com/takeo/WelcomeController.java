package com.takeo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController 
{
	@RequestMapping("/hello")
	public String sayHi()
	{
	return "welcome.jsp";
	}

}
