package com.lms.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="student")
@PrimaryKeyJoinColumn(name="studNo")
public class StudentModel extends Person{
	/*@Id
    @Column(name="studNo")
	private int studNo;*/
	
	private String studClass;
	private String email;
	
	@OneToMany(targetEntity=CourseModel.class, fetch = FetchType.LAZY, mappedBy = "studentModel")
	private Set<CourseModel> courseModel=new HashSet<CourseModel>();
	
	public StudentModel(String studClass,String email,Set<CourseModel> courseModel){
		super();
		//this.studNo=studNo;
		this.studClass=studClass;
		this.email=email;
		this.courseModel=courseModel;
	}
	
	public StudentModel() {
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudClass() {
		return studClass;
	}

	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	
	public Set<CourseModel> getCourseModel() {
		return courseModel;
	}

	public void setCourseModel(Set<CourseModel> courseModel) {
		this.courseModel = courseModel;
	}

	
}
