package com.raamji.annotation.Model;

import java.util.List;

public class Customer {
	int seqNo;
	String Name;
	List phoneNumber;
	
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
