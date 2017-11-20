package com.learn.thread;

public class PrintNumbersRun implements Runnable
{
	static int i = 1;
	static int j=1;
	Employee empObj;

	PrintNumbersRun(Employee empObj) {
		this.empObj = empObj;
	}

	
	public void run() {
		while (i <= 11 && j<=3) {
			if (j == 1 && Thread.currentThread().getName().equals("t1")) {
				synchronized (empObj) {
					System.out.println("\n\n"+Thread.currentThread().getName() + " - "+ j);
					i++;j++;
					try {
						empObj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (j == 2 && Thread.currentThread().getName().equals("t2")) {
				synchronized (empObj) {
					System.out.println(Thread.currentThread().getName() + " -- "+ j);
					i++;j++;
					empObj.notify();
					try {
						empObj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			if (j == 3 && Thread.currentThread().getName().equals("t3")) {
				synchronized (empObj) {
					System.out.println(Thread.currentThread().getName() + " --- "+ j);
					i++;j=j-2;
					empObj.notify();
				}
			}
		}//end of while
	}//end of run

}