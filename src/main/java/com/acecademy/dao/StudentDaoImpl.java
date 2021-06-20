package com.acecademy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.acecademy.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insert(Student student) {
		Integer id = (Integer) hibernateTemplate.save(student);
		return id;
	}

}
