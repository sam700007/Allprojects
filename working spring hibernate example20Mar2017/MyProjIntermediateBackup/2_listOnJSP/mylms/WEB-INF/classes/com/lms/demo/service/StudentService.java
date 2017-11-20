package com.lms.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.demo.dao.StudentDao;
import com.lms.demo.model.DepartmentEntity;
import com.lms.demo.model.StudentModel;

@Service("studentService")
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public List<DepartmentEntity> getAllDepartments() {
		return studentDao.getAllDepartments();
	}
	
	public StudentModel getStudent(String mobileNo) {
		return studentDao.getStudent(mobileNo);
	}
	
	public List<StudentModel> getAllRegisteredStudents() {
		return studentDao.getAllRegisteredStudents();
	}
	
	public boolean saveStudent(StudentModel student) {
		return studentDao.addMyStudent(student);
	}

}
