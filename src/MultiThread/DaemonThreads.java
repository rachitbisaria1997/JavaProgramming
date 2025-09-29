package MultiThread;

public class DaemonThreads {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (true){
                System.out.println("daemon thread is running");
                try {
                    Thread.sleep(500);
                    //Pauses the current thread for a given time but does not release any locks it is holding.
                    //After the time passes, the thread becomes Runnable again and competes for CPU.
                }
                catch (InterruptedException ex){

                }
            }
        });

        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread finished.");

//        Daemon thread running...
//        Daemon thread running...
//        Main thread finished.
//A daemon thread is a background thread that runs in support of non-daemon (user) threads.
        // example GC, Finalizer
        //Great for tasks like cleanup, monitoring, logging.
    }

}
