package com.learn.thread;
/*wait( ) tells the calling thread to give up the monitor and go to sleep until some other
thread enters the same monitor and calls notify( ).

notify( ) wakes up the first thread that called wait( ) on the same object.*/
public class PrintNumbers extends Thread {
	// volatile static int i = 1;
	static int i = 1;
	static int j=1;
	Employee empObj;

	PrintNumbers(Employee empObj) {
		this.empObj = empObj;
	}

	public static void main(String ar[]) {
		Employee emp1 = new Employee();
		emp1.setNaam("Raamji1");
		emp1.setSqno(1);
		Employee emp2 = new Employee();
		emp2.setNaam("Raamji2");
		emp2.setSqno(2);
		Employee emp3 = new Employee();
		emp3.setNaam("Raamji3");
		emp3.setSqno(3);
System.out.println("-------ok--11--all--");
		PrintNumbers pn1 = new PrintNumbers(emp1);
		PrintNumbers pn2 = new PrintNumbers(emp1);
		PrintNumbers pn3 = new PrintNumbers(emp1);
		pn1.setName("t1");
		pn2.setName("t2");
		pn3.setName("t3");
		pn1.start();
		pn2.start();
		pn3.start();
	}

	//@Override
	public void run() {
		while (i <= 10 && j<=3) {
			if (j == 1 )//&& Thread.currentThread().getName().equals("t1")) 
				{
				synchronized (empObj) {
					System.out.println("1 :"+Thread.currentThread().getName() + " - "+ j+" "+empObj.getNaam());
					i++;j++;
					empObj.notifyAll();
					try {
						empObj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (j == 2)// && Thread.currentThread().getName().equals("t2")) 
				{
				synchronized (empObj) {
					System.out.println("2: "+Thread.currentThread().getName() + " -- "+ j+" "+empObj.getNaam());
					i++;j++;
					empObj.notifyAll();
					try {
						empObj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			if (j == 3)// && Thread.currentThread().getName().equals("t3")) 
				{
				synchronized (empObj) {
					System.out.println("3 :"+Thread.currentThread().getName() + " --- "+ j+" "+empObj.getNaam());
					i++;j=j-2;
					empObj.notifyAll();
				}
			}
		}//end of while
	}//end of run
}