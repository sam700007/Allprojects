package MyMultithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {

   public static void main(String args[]) //throws InterruptedException
   {
 
    //Creating shared object
  //  BlockingQueue sharedQueue = new LinkedBlockingQueue();
    BlockingQueue sharedQueue1 = new PriorityBlockingQueue();

    //Creating Producer and Consumer Thread
    /*Thread prodThread = new Thread(new Producer(sharedQueue));
    Thread consThread = new Thread(new Consumer(sharedQueue));*/
//
    Thread prodThread1 = new Thread(new Producer1(sharedQueue1));
    Thread consThread1 = new Thread(new Consumer1(sharedQueue1));

    //Starting producer and Consumer thread
    /*prodThread.start();
   
    consThread.start();*/
    prodThread1.start();
    
    consThread1.start();
  //  prodThread.interrupt();
   // prodThread.sleep(2000);
   
   }

}


