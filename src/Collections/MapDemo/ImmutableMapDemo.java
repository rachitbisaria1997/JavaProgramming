package Collections.MapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {

    public static void main(String[] args){

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);

        System.out.println(map2);
        map2.put("C", 3);

        // above line throws exception
    }

}
