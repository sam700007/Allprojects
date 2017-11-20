package MyMultithreading;

import java.util.concurrent.BlockingQueue;

//Producer Class in java
class Producer1 implements Runnable {

 private final BlockingQueue sharedQueue;

 public Producer1(BlockingQueue sharedQueue) {
     this.sharedQueue = sharedQueue;
 }

 
 public void run() {
     for(int i=0; i<13; i++){
         System.out.println("Produced: " + i);
		 sharedQueue.offer(""+i);
		 
     }
 }

}
