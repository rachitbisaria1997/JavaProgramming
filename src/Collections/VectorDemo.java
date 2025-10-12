package Collections;
import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println(vector.capacity());
        vector.add(4);

        for(int i=0; i<vector.size(); i++){
            System.out.println(vector.get(i));
        }

        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() -> {

            for(int i=0; i<5; i++){
                 list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {

            for(int i=0; i<5; i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        vector.clear();

        System.out.println(list.size());
    }
}
