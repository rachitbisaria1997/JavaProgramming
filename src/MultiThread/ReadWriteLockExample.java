package MultiThread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private int sharedData = 0;
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    //Multiple readers (Reader-1, Reader-2) can read data at the same time.
    // Only one thread to write at a time, and during writing, no reading is allowed (Write Lock).

    public int readData(){
        rwLock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + " is reading data "+ sharedData);
            Thread.sleep(500);
            return sharedData;
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
            return -1;
        }
        finally {
            rwLock.readLock().unlock();
        }
    }

    public void writeData(int value){
        rwLock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + " is writing data "+ value);
            Thread.sleep(1000);
            sharedData = value;
        }
        catch (InterruptedException exception){
            exception.printStackTrace();
        }
        finally {
            rwLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {

        ReadWriteLockExample example = new ReadWriteLockExample();

        Thread writer = new Thread(() -> {
            for(int i=1; i<=5; i++){
                example.writeData(i * 10);
            }
        }, "writer");

        // Multiple Reader Threads
        Thread reader1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                example.readData();
            }
        }, "Reader-1");

        Thread reader2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                example.readData();
            }
        }, "Reader-2");

        writer.start();
        reader1.start();
        reader2.start();

        //

    }

}
