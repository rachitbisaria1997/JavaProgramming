package StaticinJava;

class Counter{
    static int count = 0;

    Counter(){
        count++;  // Incremented for every object created
    }
}

public class StaticVariableExample {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Counter : " + Counter.count);
        // Output: 3
        //All objects share the same static count
    }

}
