package ConcurrencyRunner;

public class BiCounter {

    private int i = 0;
    private int j = 0;

    synchronized public void incrementI(){
        i++;
    }

    public int getI(){
        return i;
    }

    synchronized public void incrementJ(){
        j++;
    }

    public int getJ(){
        return j;
    }

    // problem with synchronized is there are multiple synchronized methods than concurrency will be less
    // threads will be waiting as only 1 thread can access at a time
    // to solve this problem use Locks

}
