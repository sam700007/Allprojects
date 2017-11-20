package com.lms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "person") 
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uan;
	private String fName;
	private String lName;
	
	public Person(){
	
	}
	public Person(int uan,String fName, String lName){
		super();
		this.uan=uan;
		this.fName=fName;
		this.lName=lName;
	}
	
	
	public int getUan() {
		return uan;
	}
	public void setUan(int uan) {
		this.uan = uan;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

}
