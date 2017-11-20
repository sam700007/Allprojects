package com.raamji.annotation.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raamji.annotation.Model.Customer;
import com.raamji.annotation.customer.bo.CustomerBo;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

		CustomerBo customerBo = (CustomerBo) appContext.getBean("customerBo");
		Customer cust = (Customer) appContext.getBean("customer");

		System.out.println("------------------1--------------------");
		customerBo.addCustomer();
		System.out.println("------------------2--------------------");
		customerBo.addCustomerIdentity("Arun",101);
		System.out.println("------------------3--------------------");
		customerBo.addCustomerReturnValue();
		System.out.println("------------------4E--------------------");
		try {
			customerBo.addCustomerThrowException();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		/*System.out.println("-------------------addCustomerReturnValue-------------------");
		customerBo.addCustomerReturnValue();
		System.out.println("-------------------addCustomerThrowException-------------------");
		*/
		/*try {
			customerBo.addCustomerThrowException();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		System.out.println("---------around-----------------");
		customerBo.addCustomerAround(100,cust);
*/	}
}