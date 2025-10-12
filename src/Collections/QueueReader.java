package Collections;

import java.util.*;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String value1, String value2){
        return Integer.compare(value2.length(), value1.length());
    }

}

public class QueueReader {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("zebra", "monkey", "cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

}


Comparator<Integer> com = new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2)
        {
            return 1;
        }
        else{
            return -1;
        }
    }
}

List<Integer> al = new ArrayList<>();
al.add(10);
al.add(20);

Collections.sort(al, com);

