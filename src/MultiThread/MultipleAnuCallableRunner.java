package MultiThread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnuCallableRunner {

    public static void main(String [] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("in28 minutes"), new CallableTask("Ranga"), new CallableTask("Adam"));

        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        executorService.shutdown();

        //Whichever task finishes first will print something like:
        //Hello Adam from pool-1-thread-3
        //Callable<V> is an interface in java.util.concurrent.
        //It can return a value (of type V)
        //It can throw a checked exception.
    }

}
