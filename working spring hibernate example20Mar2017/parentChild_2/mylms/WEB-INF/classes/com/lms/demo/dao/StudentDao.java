package com.lms.demo.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.demo.model.StudentModel;

@Repository
@Transactional
public class StudentDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public boolean addEmployee1(StudentModel student) 
	{
		try {
		//Use null checks and handle them
		//employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
		manager.persist(student);
		return true;
		}catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

}
