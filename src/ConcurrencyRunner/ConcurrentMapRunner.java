package ConcurrencyRunner;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

    public static void main(String[] args) {

        ConcurrentMap<String, Integer> occurances = new ConcurrentHashMap<>();
        // concurrentmap is a thread safe implementation, allows multiple thread to read and write simultaneously without
        // locking the entire map.

        //If multiple threads access a shared resource (like a variable, object, or method), and the outcome
        // is always correct and predictable, regardless of the order in which threads execute, then that resource is thread-safe.

        occurances.put("A", 1);
        occurances.put("B", 2);
        occurances.put("C", 3);

        System.out.println(occurances.size());

        System.out.println("value of A is" + occurances.get("A"));

        occurances.remove("A");
        System.out.println("size of map is "+occurances.size());
    }

}

// concurrenthashmap helps avoiding in synchronization issues
// ConcurrentMap is an interface, ConcurrentHashMap is implementation

