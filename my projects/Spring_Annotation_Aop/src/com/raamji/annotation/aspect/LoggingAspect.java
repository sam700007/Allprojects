package com.raamji.annotation.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.raamji.annotation.customer.bo.CustomerBo;

@Aspect
public class LoggingAspect {

	/*@Before("execution(* com.raamji.annotation.customer.bo.CustomerBo.addCustomerIdentity(..))")
	public void logBefore(JoinPoint joinPoint) {
		//System.out.println("logBefore() is running!");
		System.out.println("hijacked logBefore() getName: " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("hijacked logBefore() getKind: " + joinPoint.getSignature().getDeclaringType());
		
		System.out.println("------hijacked logBefore() Method call-----"  );
		CustomerBo customerBo = (CustomerBo)joinPoint.getTarget();
		customerBo.addCustomerIdentity("ShRaam",90);
		String temp=customerBo.addCustomerReturnValue();
		System.out.println("------hijacked logBefore() Complete-----:"+temp  );
	}*/
	
/*	@After("execution(* com.raamji.annotation.customer.bo.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {
		//System.out.println("logAfter() is running!");
		System.out.println("hijacked logAfter() : " + joinPoint.getSignature().getName());
	}
*/	
	@AfterReturning(pointcut = "execution(* com.raamji.annotation.customer.bo.CustomerBo.*(..))",
		      returning= "result")
		   public void logAfterReturning(JoinPoint joinPoint, Object result) {
			//System.out.println("logAfterReturning() is running!");
			System.out.println("Method Signature : " + joinPoint.getSignature());
			System.out.println("Method Name : " + joinPoint.getSignature().getName());
			System.out.println("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
			System.out.println("Method returned value is : " + result);
		   }
	
	@AfterThrowing(pointcut = "execution(* com.raamji.annotation.customer.bo.CustomerBo.*(..))",
		      throwing= "error")
		    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
			//System.out.println("logAfterThrowing() is running!");
		System.out.println("======================S=======================");
		System.out.println("Method Signature : " + joinPoint.getSignature());
		System.out.println("Method Name : " + joinPoint.getSignature().getName());
		System.out.println("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
			System.out.println("Exception : " + error.getMessage());
			System.out.println("====================E=========================");
		    }
	
/*
	   @Around("execution(* com.raamji.annotation.customer.bo.CustomerBo.*(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Method Name : " + joinPoint.getSignature().getName());
		System.out.println("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		Object obj = null;
		System.out.println("Around before is running!");
		try{
		 obj=joinPoint.proceed(); //continue on the intercepted method
		}catch(Exception e)
		{
			System.out.println("Exceptioooooooooooooooooooooon :"+e.getMessage());
		}
		//System.out.println("Exception : " + error.getMessage());
		System.out.println("Around after is running!"+obj.toString());
	   }*/

}