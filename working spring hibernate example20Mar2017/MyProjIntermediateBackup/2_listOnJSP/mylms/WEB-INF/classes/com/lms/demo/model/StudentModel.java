package com.lms.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="student")
@PrimaryKeyJoinColumn(name="studNo")
public class StudentModel extends Person{
	
	private String studClass;
	private String email;
	@ManyToOne
	private DepartmentEntity department;
	private boolean gender;
	
	private Long mobileNumber;
	
	private ArrayList<String> studentSkills;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="studentModel", cascade = CascadeType.ALL)
	private List<Subject> subjects;
	
	public StudentModel() {
	}
	
	public StudentModel(String studClass, String email,
			DepartmentEntity department, boolean gender, Long mobileNumber,
			ArrayList<String> studentSkills, List<Subject> subjects) {
		super();
		this.studClass = studClass;
		this.email = email;
		this.department = department;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.studentSkills = studentSkills;
		this.subjects = subjects;
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

	public DepartmentEntity getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
}
