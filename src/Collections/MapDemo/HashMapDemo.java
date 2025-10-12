package Collections.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // Compute hashCode() of key, Apply internal hash function to improve distribution
        // each bucket contains LL, compute hash code of key
        // index = (n-1) & hash

//        a) Storing (put)
//        Compute hashCode() of key
//
//        Apply internal hash function to improve distribution
//
//        Calculate bucket index: index = (n - 1) & hash
//
//        Traverse the bucket:
//
//        If key exists (via .equals()), update value
//
//        Else, add new node
//
//        If collisions exceed threshold (default 8), convert bucket to tree
//
//        b) Retrieving (get)
//        Compute hash and index
//
//        Traverse linked list/tree in the bucket
//
//        Use .equals() to find the key

        Map<String, String> map = new HashMap<>();
        map.put(null, "value"); // allowed


        // to make methods of HashMap as synchronized use Collections.synchronizedMap

        Map<String, String> mp = Collections.synchronizedMap(map);

        for(Map.Entry<String, String> ma : mp.entrySet()){
            System.out.println(ma.getKey() + "  " + ma.getValue());
        }
    }

}
