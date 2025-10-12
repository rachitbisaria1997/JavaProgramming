package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);

        System.out.println(pq);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        // implements queue interface
        // it uses heap
        // head of queue is the least or highest priority element
        // By default, it uses natural ordering (i.e., for numbers, smallest number has the highest priority).
    }

}
