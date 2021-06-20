package com.acecademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acecademy.entity.Student;
import com.acecademy.service.StudentService;


@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/user-reg")
	public String name() {
		return "contact";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute Student student) {
		
		System.out.println(student);
		
		studentService.registerStudent(student);
		return "contact";
	}

}
