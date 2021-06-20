package com.acecademy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String prcessForm(HttpServletRequest request) {
		
		System.out.println("Hey!");
		
		System.out.println(request.getParameter("email"));
		return "contact";
	}
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register(@ModelAttribute Student student) {
//		
//		System.out.println("Hey!");
//		
//		studentService.registerStudent(student);
//		return "contact";
//	}
	
	
	
//	@RequestMapping(value = "/process", method = RequestMethod.POST)
//	public String prcessForm1(@ModelAttribute ) {
//		
//		System.out.println("Hey!");
//		
//		System.out.println(request.getParameter("email"));
//		return "contact";
//	}
}
