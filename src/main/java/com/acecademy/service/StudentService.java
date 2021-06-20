package com.acecademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acecademy.dao.StudentDao;
import com.acecademy.entity.Student;

@Component("studentService")
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	
	public Integer registerStudent(Student student) {
		return studentDao.insert(student);
	}

}
