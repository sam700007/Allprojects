package com.lms.demo.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.demo.model.StudentModel;
import com.lms.demo.model.DepartmentEntity;

@Repository
@Transactional
public class StudentDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	/*public List<EmployeeEntity> getAllEmployees() 
	{
		List<EmployeeEntity> employees = manager.createQuery("Select a From EmployeeEntity a", EmployeeEntity.class).getResultList();
        return employees;
	}*/
	
	public List<DepartmentEntity> getAllDepartments() 
	{
		DepartmentEntity departmentEntity=manager.find(DepartmentEntity.class, 1);
		List<DepartmentEntity> depts = manager.createQuery("Select a From DepartmentEntity a", DepartmentEntity.class).getResultList();
        return depts;
	}
	
	public StudentModel getStudent(String mobileNo) 
	{
		StudentModel departmentEntity=manager.find(StudentModel.class, 1);
		TypedQuery<StudentModel> depts = manager.createQuery("Select a From DepartmentEntity a", StudentModel.class).setParameter("mobileNumber", mobileNo);
        return depts.getSingleResult();
	}
	
	public List<StudentModel> getAllRegisteredStudents() 
	{
		StudentModel studentModel=manager.find(StudentModel.class, 1);
		List<StudentModel> depts = manager.createQuery("Select a From StudentModel a", StudentModel.class).getResultList();
        return depts;
	}
	
	public boolean addMyStudent(StudentModel student) 
	{
		try {
		//Use null checks and handle them
		//employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
			//System.out.println("----------------"+student.getCourseModel().get(0).getCourseName());
			//manager.persist(student.getCourseModel());
		manager.persist(student);
		return true;
		}catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

}
