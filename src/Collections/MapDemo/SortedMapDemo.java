package Collections.MapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(45, "vivek");
        map.put(55, "mohit");
        map.put(65, "arun");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        // sorted map represents a map sorted by its keys in natural order
        // keys are sorted in ascending natural order
    }

}
