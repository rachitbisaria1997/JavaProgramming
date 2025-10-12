package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new LinkedList<>();

        queue1.add(1);

        System.out.println(queue1.size());

        System.out.println(queue1.remove());  // throws exception if empty

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(2));
        System.out.println(queue2.offer(2));

    }

}
