package MultiThread;

import java.util.concurrent.atomic.AtomicInteger;

public class CyclicCounter {

    private final int limit;
    private final AtomicInteger counter = new AtomicInteger(0);

    public CyclicCounter(int limit){
        this.limit = limit;
    }

    public int next(){
        return counter.getAndUpdate(current -> (current + 1) % limit);
    }

}

class RoundRobinExample {

    public static void main(String[] args) {

        CyclicCounter counter = new CyclicCounter(3);

        Runnable task = () -> {
          int workerId = counter.next();
          System.out.println("current thread is "+ Thread.currentThread().getName() + " assigned to worker "+ workerId);
        };

        for(int i=0; i < 10; i++){
            new Thread(task).start();
        }
    }
//
//Suppose you have 3 workers: Worker 0, 1, 2.
//    Each incoming task should go to workers in round-robin:
//
//    Task → Worker 0
//    Task → Worker 1
//    Task → Worker 2
//    Task → Worker 0
//    Task → Worker 1          ...
}
