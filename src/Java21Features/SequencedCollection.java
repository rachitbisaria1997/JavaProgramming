package Java21Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequencedCollection {

    public static void main(String[] args) {

        // added methods getFirst(), getLast(), addFirst(), addLast(), removeFirst(), removeLast()
        //reversed()

        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

       // System.out.println("First: " + names.getFirst()); // Alice
      //  System.out.println("Last: " + names.getLast());   // Charlie

       // names.addFirst("Zara");
       // names.addLast("David");

        System.out.println("After adding: " + names);
        // [Zara, Alice, Bob, Charlie, David]

        //names.removeFirst();
        //names.removeLast();

        System.out.println("After removing: " + names);
        // [Alice, Bob, Charlie]

      //  System.out.println("Reversed: " + names.reversed());
        // [Charlie, Bob, Alice]

    }

}
