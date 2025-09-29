package MultiThread;

class DeadlockExample{

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1(){
        synchronized (lock1){
            System.out.println("thread1 : holding lock1");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
            synchronized (lock2){
                System.out.println("thread 1 holding lock1 and lock2");
            }
        }
    }

    public void method2(){
        synchronized (lock2){
            System.out.println("thread2 : holding lock2");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){

            }
            synchronized (lock1){
                System.out.println("thread 2 holding lock2 and lock1");
            }
        }
    }

}

public class DeadlockEx {
    public static void main(String[] args) {

        DeadlockExample obj = new DeadlockExample();

        Thread t1 = new Thread(() -> obj.method1());
        Thread t2 = new Thread(() -> obj.method2());

        t1.start();
        t2.start();
        //output will be
        //Thread 1: Holding lock1...
        //Thread 2: Holding lock2...

        //A deadlock happens when two or more threads are waiting for each other’s lock forever, and none of them can proceed.



    }
}


// how to avoid deadlocks
// 1. Always acquire locks in the same order across all threads.
// first lock1 can be acquired then lock2 for both the methods. circular waiting cannot occur.

//    public void method1() {
//        synchronized (lock1) {
//            System.out.println("Thread 1: Holding lock1...");
//            try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//            synchronized (lock2) {
//                System.out.println("Thread 1: Holding lock1 & lock2...");
//            }
//        }
//    }
//
//    public void method2() {
//        synchronized (lock1) { // Changed: lock1 first, then lock2 (same order as method1)
//            System.out.println("Thread 2: Holding lock1...");
//            try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//            synchronized (lock2) {
//                System.out.println("Thread 2: Holding lock1 & lock2...");
//            }
//        }
//    }


// 2. use concurrent utilities like ConcurrentHashMap
