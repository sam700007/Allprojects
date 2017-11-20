package com.lms.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
	
	public StudentModel(String studClass,String email){
		super();
		//this.studNo=studNo;
		this.studClass=studClass;
		this.email=email;
	}
	
	public StudentModel() {
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	/*public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}*/

	public String getStudClass() {
		return studClass;
	}

	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	
	
}
