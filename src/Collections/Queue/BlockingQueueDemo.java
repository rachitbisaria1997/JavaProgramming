package Collections.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {

        // put --> blocks if the queue is full until space become avail
        // take --> blocks if queue is empty until an element becomes avail
        // offer - waits for space to become avail

        // thread safe
        // wait doe queue to become non empty

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // uses a single lock for both enqueue and dequeue operations

        Thread producer = new Thread(() -> {
            int value = 1;

            try{

                while (true){
                    System.out.println("producing " +value);
                    queue.put(value);
                    value++;
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException ex){
                System.out.println("producer is interrupted");
            }
        });

        Thread consumer = new Thread(() -> {

            try{
                while(true){
                    Integer item = queue.take();
                    System.out.println("consuming "+ item);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException ex){
                System.out.println("consumer interrupted");
            }
        });

        producer.start();
        consumer.start();

        Thread.sleep(7000);

        producer.interrupt();
        consumer.interrupt();
    }

}
