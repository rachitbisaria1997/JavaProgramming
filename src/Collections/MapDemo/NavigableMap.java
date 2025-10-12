package Collections.MapDemo;

import java.util.TreeMap;

public class NavigableMap {

    public static void main(String[] args) {

        java.util.NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "one");
        navigableMap.put(2, "two");
        navigableMap.put(3, "three");
        navigableMap.put(4, "four");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        // all methods are synchronized, no null values, slower than hashmap, uses LL in case of collision

    }

}
