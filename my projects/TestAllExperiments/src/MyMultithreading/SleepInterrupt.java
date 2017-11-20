package MyMultithreading;

public class SleepInterrupt extends Object implements Runnable {
	  public void run() {
	    try {
	      System.out.println("in run() - sleep for 20 seconds");
	      Thread.sleep(20000);
	      System.out.println("in run() - woke up");
	    } catch (InterruptedException x) {
	      System.out.println("in run() - interrupted while sleeping");
	      return;
	    }
	    finally
	    {
	    	System.out.println("Jai sh Raam");
	    }
	    System.out.println("in run() - leaving normally");
	  }

	  public static void main(String[] args) {
	    SleepInterrupt si = new SleepInterrupt();
	    Thread t = new Thread(si);
	    t.start();

	    // Be sure that the new thread gets a chance to
	    // run for a while.
	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException x) {
	    }

	    System.out.println("in main() - interrupting other thread");
	    t.interrupt();
	    System.out.println("in main() - leaving");
	  }
	}