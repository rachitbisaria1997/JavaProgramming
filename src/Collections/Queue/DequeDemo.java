package Collections.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args){

        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);

        System.out.println(deque1);
        System.out.println("first element is " + deque1.getFirst());

        System.out.println("last element is " + deque1.getLast());

        System.out.println(deque1);

    }

}
