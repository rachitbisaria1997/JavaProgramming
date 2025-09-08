import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

        private final Lock lock = new ReentrantLock();
        private int counter = 0;

        public void increment(){
            lock.lock();
            try{
                counter++;
                System.out.println("counter increased "+ Thread.currentThread().getName());
            }
            finally {
                lock.unlock();
            }
        }

        public int getCounter(){
            return this.counter;
        }


    public static void main(String[] args) {

        LockExample lockExample = new LockExample();

        Runnable task = lockExample::increment;
        Thread t1 = new Thread(task, "thread 1");
        Thread t2 = new Thread(task, "thread 2");
        Thread t3 = new Thread(task, "thread 3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println(lockExample.getCounter());
    }

}
