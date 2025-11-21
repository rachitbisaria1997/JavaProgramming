package MultiThread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
           return 10;
        });

        future.thenAccept(result -> System.out.println("result "+ result));

        // no need of executor service
        // Main thread continues
        // No blocking get()
        // Automatically runs in ForkJoinPool
    }

}
