package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo extends Task{

    public ExecutorServiceDemo(int number) {
        super(number);
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // at a time max 2 threads can run. It can be used to start, stop, and manage multiple tasks.
        // helps in handling large num of tasks efficiently.. That means only 2 tasks run in parallel at a time

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));

        executorService.shutdown();


        //use of executor service
        //You don’t create/start threads manually. The pool handles it.
        // Reuses a fixed number of threads → avoids overhead of creating new threads for each task.
        // Good for handling large numbers of tasks efficiently.

        //Run tasks in the background without blocking the main thread.
        //Thread pool management → Reuse a pool of worker threads instead of creating new ones.
        // Task scheduling → Delayed and periodic execution with ScheduledExecutorService.
        //Task submission & execution → Submit Runnable or Callable tasks, get results back with Future.
        // Completion & termination management → Graceful shutdown using shutdown(), shutdownNow(), awaitTermination().


    }

}
