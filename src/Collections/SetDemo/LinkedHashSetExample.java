package Collections.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Orange");
        linkedSet.add("Apple");  // Duplicate ignored

        System.out.println(linkedSet);

        //Maintains insertion order.
        //Output: [Apple, Banana, Orange]
    }

}
