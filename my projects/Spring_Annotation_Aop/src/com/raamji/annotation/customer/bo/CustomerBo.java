package com.raamji.annotation.customer.bo;

import com.raamji.annotation.Model.Customer;

public interface CustomerBo {

	void addCustomer();
	
	public String addCustomerIdentity(String name, int age);

	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	Customer addCustomerAround(int seqNo, Customer cust);
}