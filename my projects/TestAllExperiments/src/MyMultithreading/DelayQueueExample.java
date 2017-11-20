package MyMultithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {

    public static void main(String[] args) {

        BlockingQueue<DelayedElement> blockingQueue = new DelayQueue<DelayedElement>();

        try {
            blockingQueue
                    .put(new DelayedElement(4000, "Message with delay 4s"));
            blockingQueue
                    .put(new DelayedElement(2000, "Message with delay 2s"));
            blockingQueue
                    .put(new DelayedElement(9000, "Message with delay 9s"));
        } catch (InterruptedException ie) {
        }

        while (!blockingQueue.isEmpty()) {
            try {
                System.out.println(">>" + blockingQueue.take());
            } catch (InterruptedException ie) {
            }

        }

    }
}
