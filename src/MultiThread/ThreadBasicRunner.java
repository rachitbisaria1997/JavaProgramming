package MultiThread;

class Task1 extends Thread{

    public void run(){
        System.out.println("task1 started");

        for(int i=101; i<=199; i++){
            System.out.print(i + " ");

            Thread.yield();
        }
        System.out.println("\nTask1 done");
    }
}

class Task2 extends Thread{

    public void run(){
        System.out.println("task2 started");

        for(int i=201; i<=299; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 done");
    }
}

public class ThreadBasicRunner {

    public static void main(String[] args) throws InterruptedException {

        Task1 task1 = new Task1();
        System.out.print("task 1 started");
        task1.setPriority(1);
        task1.start();

        System.out.println("task 2 started");
        Task2 task2 = new Task2();
        task2.setPriority(Thread.MAX_PRIORITY);
        task2.start();

        task1.join();
        // join() method is used when you want one thread to wait for the completion of
        // another thread before it continues... main thread will wait until task1 finishes

        // task 3 starts once task1 is completed
        // parrallism is achieved using threads

        System.out.println("task 3 started");
        for(int i=301; i<=399; i++){
            System.out.println(i + " ");

        }
        System.out.println("\nTask3 done");
    }

//    //
//    Main: task 1 started
//    task2 started
//    201 202 203 ... 299
//    101 102 103 ... 199
//    Task2 done
//    Task1 done
//    task 3 started
//    301 302 ...
//    Task3 done


}
