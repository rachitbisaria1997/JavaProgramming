package Java21Features;

public class VirtualThreads {

    public static void main(String[] args) {

        //number of threads are limited. to achieve high throughput concurrnecy, we use virtual threads
        // which are light weight and helps in achieving high throughput


        Runnable task = () -> {
            System.out.println("running in thread" + Thread.currentThread().getName());
        };

//
//        Thread.startVirtualThread(task);
//
//        Thread virtualThread = Thread.ofVirtual().start(task);

        // light weight threads help us to achieve high throughput concurrent applications

    }

}
