package ConcurrencyRunner;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

    // concurrency refers to ability of a program to execute multiple tasks simul improving performance and speed

    // atomic integers allows to perform thread safe operations on integers.
    // Multiple threads can operate on an AtomicInteger without corrupting its state.
        private AtomicInteger i = new AtomicInteger();

        public void incrementI(){
            i.incrementAndGet();
        }

        public int getI(){
            return i.get();
        }

        //AtomicInteger is a thread-safe class in the java.util.concurrent.atomic package that
        // allows you to safely perform atomic operations (like increment, decrement, get, set, compare-and-set)
         // on integers without using locks.

    // If 100 threads call incrementI() at the same time: With AtomicInteger, i will correctly become 100.
    // with a plain int, synchronized block will be required else will get less than 100.
    // It ensures atomicity (indivisible operations), so even in a multi-threaded environment, there's no race condition.

}

class Demo{

    public static void main(String[] args) throws InterruptedException {

        BiCounterWithAtomicInteger obj = new BiCounterWithAtomicInteger();

        Runnable task = () -> {

            for(int i=0; i<10;i++){

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
