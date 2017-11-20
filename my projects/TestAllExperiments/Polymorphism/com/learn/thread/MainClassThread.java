package com.learn.thread;

public class MainClassThread {

	public static void main(String ar[]) {
		System.out.println("-----PrintNumbersRun--77-----------");
		Employee emp = new Employee();
		PrintNumbersRun emp1 = new PrintNumbersRun(emp);
		PrintNumbersRun emp2 = new PrintNumbersRun(emp);
		PrintNumbersRun emp3 = new PrintNumbersRun(emp);
		
		Thread t1 = new Thread(emp1,"t1");
        t1.start();
        Thread t2 = new Thread(emp2,"t2");
        t2.start();
        Thread t3 = new Thread(emp3,"t3");
        t3.start();
	}
	
}
