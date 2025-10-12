package Collections.SetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Orange");

        System.out.println(sortedSet);  // Output: [Apple, Banana, Orange]

    }
}
