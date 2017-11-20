package MyMultithreading;

import java.util.concurrent.BlockingQueue;

//Producer Class in java
public class Producer implements Runnable {

 private final BlockingQueue sharedQueue;

 public Producer(BlockingQueue sharedQueue) {
     this.sharedQueue = sharedQueue;
 }

 
 public void run() {
     for(int i=0; i<3; i++){
         try {
             System.out.println("Produced: " + i);
             sharedQueue.put(":"+i); 

         } catch (InterruptedException ex) {
      	   System.out.println("Mai aagaya");
            // Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 }

}
