package MultiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future = service.submit(() -> {
           Thread.sleep(1000);
           return 10;
        });


        Integer res = future.get();

        System.out.println(res); // get is blocking, waits for results
        //A new background thread (from ThreadPool) executes the task
        // No chaining, No combination of multiple async tasks


    }

}
