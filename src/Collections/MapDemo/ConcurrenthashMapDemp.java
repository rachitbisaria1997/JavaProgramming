package Collections.MapDemo;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenthashMapDemp {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);

        System.out.println("value of A is "+ map.get("A"));

        map.remove("B");
        map.putIfAbsent("C++", 3);

        map.forEach((k, v) -> System.out.println(k + ":"+ v));

        System.out.println("after removal map size is "+ map.size());


        // its thread safe, doesnt maintains order, and suitable for concurrency
        // allows concurrent access without needing to synchronize the entire map.
        // thread safe means multiple threads can access or modify the same data structure simultaneously without corrupting the data
        // data is not lost. There is no need for the developer to manually use synchronized blocks

        //ConcurrentHashMap internally structured same as HashMap. ConcurrentHashMap also internally maintains
        //an array of buckets where each bucket contains key-value pairs stored as linked list or as binary tree (Java 8+)
        //if the number of key-value pairs in a bucket exceed TREEIFY_THRESHOLD.

        //With addition to these things, ConcurrentHashMap maintains bucket level locking system to achieve the thread safeness
        //In the bucket level locking system, each bucket is locked. Any thread wants to perform write operations on a bucket,
        //has to acquire the lock of that bucket and enter into it. Only one thread can enter into a bucket at any given time.
        //Other threads which want to write on the same bucket have to wait. But, read operations are lock free. Any thread wants
        //to read from a bucket, it can do so without acquiring the lock of that bucket.

        //it is fail safe iterator never throw ConcurrentModificationException
    }

}
