package MultiThread.CreatingThread;

class Mytask implements Runnable{
    public void run(){
        System.out.println("Thread running using Runnable interface");
    }
}

class Demo{

    public static void main(String[] args) {

        Thread t1 = new Thread(new Mytask());
        t1.start();

    }
}