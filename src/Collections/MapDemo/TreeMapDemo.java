package Collections.MapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Integer> mp = new TreeMap<>();

        mp.put("A", 1);
        mp.put("B", 1);
        mp.put("C", 1);
        mp.put("D", 1);
        mp.put("E", 1);
        mp.put("F", 1);


        System.out.println(mp.higherKey("B"));

        System.out.println(mp.ceilingKey("B"));

        System.out.println(mp.floorKey("B"));

        System.out.println(mp.lowerKey("B"));

        System.out.println(mp.firstEntry());
        System.out.println(mp.lastEntry());

        System.out.println(mp.subMap("B", "F"));


        // only maintains order, not thread safe and not suitable for concurrency
        //TreeMap is implemented using a Red-Black Tree (a type of self-balancing binary search tree).
        // Every key is stored as a node in the tree. Treemap orders key based on their natural ordering, key must implement
        // Comparator or Comparable. when we insert a new key, its compared with root key
        // if smaller goes to left else goes to right.. if key already exists, update the value

    }

}
