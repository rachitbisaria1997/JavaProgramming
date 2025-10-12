package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache <K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int cap){
        this.capacity = cap;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("bob", 99);
        studentMap.put("alice", 101);
        studentMap.put("ram", 199);
        studentMap.put("vipul", 89);

        // here capacity is 3, least recently used is bob hence its removed from studentmap

        System.out.println(studentMap);
    }

}
