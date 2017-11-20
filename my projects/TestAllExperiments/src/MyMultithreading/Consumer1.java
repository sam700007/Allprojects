package MyMultithreading;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer1 implements Runnable{

	   private final BlockingQueue sharedQueue;

	   public Consumer1 (BlockingQueue sharedQueue) {
	       this.sharedQueue = sharedQueue;
	   }
	 
	   
	   public void run() {
		   Object value;
	      while(!Thread.interrupted()){
	    	  if ((value = sharedQueue.poll()) != null) 
	           System.out.println("Consumed: "+ value);
	          
	       }
	   }
	 
	 
	}
