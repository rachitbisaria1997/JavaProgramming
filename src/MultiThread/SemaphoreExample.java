package MultiThread;

import java.util.concurrent.Semaphore;

public class SemaphoreExample
{

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);

        // only 3 threads can enter a resource at the same time

        Runnable task = () -> {

            try {
                semaphore.acquire();
                System.out.println("thread got access: " + Thread.currentThread().getName());
            }
            catch (Exception e){

            }
            finally {
                semaphore.release();
            }

        };
        // use is Rate limiting
    }

}
