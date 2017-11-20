package com.lms.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.demo.dao.StudentDao;
import com.lms.demo.model.StudentModel;

@Service("studentService")
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public boolean saveEmployee(StudentModel student) {
		return studentDao.addEmployee1(student);
	}

}
