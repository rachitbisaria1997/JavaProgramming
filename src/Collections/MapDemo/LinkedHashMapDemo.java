package Collections.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11);
        linkedHashMap.put("orange", 6);
        linkedHashMap.put("apple", 5);
        linkedHashMap.put("banana", 6);

        for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

        int res = linkedHashMap.getOrDefault("orange", 0);
        System.out.println(res);

        // it preserves insertion order—the order in which keys were inserted
    }

}
