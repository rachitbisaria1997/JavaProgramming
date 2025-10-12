package Collections.MapDemo;


import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListDemo{

    public static void main(String[] args) {

        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("jamun", 3);

        System.out.println(map);

        System.out.println("first key is "+ map.firstKey());
        System.out.println("ceiling key is "+ map.ceilingKey("B"));

        // its thread safe, maintains order, and suitable for concurrency
        // maintains keys in natural order,

    }

}