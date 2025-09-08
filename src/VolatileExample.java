public class VolatileExample {

    private volatile int counter = 0;

    public void increment(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }

    public static void main(String[] args) throws InterruptedException {

        VolatileExample vc = new VolatileExample();

        Runnable task = () -> {

            for(int i=0; i<100; i++){
                System.out.println("called by "+ Thread.currentThread().getName());
                vc.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vc.getCounter());

    }
}
