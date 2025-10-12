package MultiThread;

class Counter{
    private int count = 0;

    public void increment(){
        count++;
    }
    public int getCount(){
        return this.count;
    }

}

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i=0; i <100; i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // A race condition happens when two or more threads access shared data at the same time
        //expected result shud be 200, but often we get less ex 180 because both the threads are updating count at same time, overwriting each
        // others update


        // 1. to avoid racecondition use synchronized blocks
        //public synchronized void increment() {
        //        count++;
        //    }
        //
        //    public synchronized int getCount() {
        //        return count;
        //    }


        // 2. use Locks.
//        private int count = 0;
//        private final ReentrantLock lock = new ReentrantLock();
//
//        public void increment() {
//            lock.lock();
//            try {
//                count++;
//            } finally {
//                lock.unlock();
//            }
//        }
//
//        public int getCount() {
//            return count;
//        }

       // 3. use atomic integers.
        // 4. use ConcurrentHashMap, CopyOnWriteArrayList
    }
}
