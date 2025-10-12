package Collections.MapDemo;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        IdentityHashMap<String, String> map = new IdentityHashMap<>();

        String key1 = new String("test");
        String key2 = new String("test");

        map.put(key1, "Value1");
        map.put(key2, "Value2");

        System.out.println(map.size());

        // it uses == to compare keys and values.

    }

}
