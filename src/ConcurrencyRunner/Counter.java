package ConcurrencyRunner;

public class Counter {

    int i = 0;

    synchronized public void increment(){
        i++;
    }

    // only 1 thread at a time can access above method. if synchronized is not used,
    // then there are chance i is not updated correctly or missed


    public int getI(){
        return i;
    }

}
