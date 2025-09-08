package MultiThread;

public class Task extends Thread{

    private int number;

    public Task(int number){
        this.number = number;
    }

    public void run(){

        System.out.println("Task " + number + " is running by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + number + " completed by " + Thread.currentThread().getName());
    }

//    Task 1 is running by pool-1-thread-1
//    Task 2 is running by pool-1-thread-2
//    Task 1 completed by pool-1-thread-1
//    Task 3 is running by pool-1-thread-1
//    Task 2 completed by pool-1-thread-2
//    Task 4 is running by pool-1-thread-2
//    Task 3 completed by pool-1-thread-1
//    Task 4 completed by pool-1-thread-2


    // at a time max 2 tasks will run

}
