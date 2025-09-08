package MultiThread;

import java.util.List;
import java.util.concurrent.*;


public class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "hello "+ name;
    }
}

class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> tasks = List.of(new CallableTask("28 mins"), new CallableTask("ranga"),
                new CallableTask("adam"));

        //0once all 3 tasks completes execution, result will be stored.
        List<Future<String>> results = executorService.invokeAll(tasks);

        for(Future<String> result: results){
            System.out.println(result.get());
        }

        executorService.shutdown();

        //Future<V> is a placeholder for a result that will be available in the future.
        //Returned when you submit a Callable task to an ExecutorService.
        //Check if the task is done (isDone()).
        //
        //Cancel the task (cancel()).
        //
        //Get the result (get() → blocks until the task completes).

    }
}
