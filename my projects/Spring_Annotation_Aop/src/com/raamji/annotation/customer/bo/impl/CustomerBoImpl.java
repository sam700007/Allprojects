package com.raamji.annotation.customer.bo.impl;

import java.util.ArrayList;
import java.util.List;

import com.raamji.annotation.Model.Customer;
import com.raamji.annotation.customer.bo.CustomerBo;

public class CustomerBoImpl implements CustomerBo {

	public void addCustomer(){
		System.out.println("addCustomer() is running ");
	}
	
	public String addCustomerIdentity(String name, int age){
		System.out.println("addCustomerIdentity() is running name:"+name+"   :   age:"+age);
		int zero=0;
		//int temp=age/zero;
	return name+age;
	}

	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		int a=5;
		int b=0;
		int c=a/b;
		//throw new Exception("Generic Error");
	}

	public Customer addCustomerAround(int seqNo, Customer cust){
		cust.setSeqNo(seqNo);
		cust.setName("Arun");
		List<String> list=new ArrayList<String>();
		list.add("123");
		list.add("789");
		cust.setPhoneNumber(list);
		System.out.println("addCustomerAround() Method is running, args seqNo : " + seqNo+ " : "+cust.getName());
		return cust;
	}
}
