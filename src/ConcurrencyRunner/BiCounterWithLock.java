package ConcurrencyRunner;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

    private int i = 0;
    private int j = 0;

    //Concurrency in Java refers to the ability of a program to execute multiple tasks simultaneously,
    // which helps improve performance and responsiveness

    Lock lockForI = new ReentrantLock();
     Lock lockForJ = new ReentrantLock();

     public void incrementI(){
         // only 1 thread can access at a time
        lockForI.lock();
        try{
            i++;
        }
        finally {
            lockForI.unlock();
        }
    }
    // to safely increment shared var i in a multi threaded environemt.  ensuring that only one thread can increment i at a time.
    // This acquires the lock. If another thread already holds it, the current thread will wait (block) until it becomes available.

    public int getI(){
        return i;
    }

    public int getJ(){
        return j;
    }

     public void incrementJ(){
        lockForJ.lock();
        try{
            j++;
        }
        finally{
            lockForJ.unlock();
        }
        // try finally Ensures that the lock is always released, even if an exception is thrown during the execution of i++.
    }

    public static void main(String[] args) throws InterruptedException{

        BiCounterWithLock obj = new BiCounterWithLock();

        Runnable task = () -> {

            for(int i=0; i<10; i++){
                obj.incrementI();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.getI());

    }

}
