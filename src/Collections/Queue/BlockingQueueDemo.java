package Collections.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producder implements Runnable{

    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producder(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                System.out.println("producder produced :"+ value);
                queue.put(value++);
                Thread.sleep(1000);
            }
            catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Producder interrupted");
            }
        }
    }
}

class Consumer implements Runnable{

    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                Integer value = queue.take();
                System.out.println("consumer consumed :"+ value);
                Thread.sleep(2000);
            }
            catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("consumer interrupted");
            }
        }
    }
}

public class BlockingQueueDemo {

    public static void main(String[] args) {

        // put --> blocks if the queue is full until space become avail
        // take --> blocks if queue is empty until an element becomes avail
        // offer - waits for space to become avail

        // thread safe
        // wait doe queue to become non empty

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // uses a single lock for both enqueue and dequeue operations
        // more

        Thread producer = new Thread(new Producder(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();



    }

}
