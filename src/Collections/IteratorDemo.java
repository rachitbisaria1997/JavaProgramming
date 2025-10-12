package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){

            Integer num = iterator.next();
            if(num % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

}
