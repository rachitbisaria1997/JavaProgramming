package MultiThread.CreatingThread;

class MyThread extends Thread{
    public void run(){
        System.out.println("thread is running "+ Thread.currentThread().getName());
    }
}

public class ExtendThreadClass {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.run();

    }

}
