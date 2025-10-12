package Collections;

import java.util.Hashtable;

public class HashTableDemp {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<>();

        hashTable.put(1, "apple");
        hashTable.put(2, "banana");
        hashTable.put(3, "cherry");

        // its synchronized, no null key or value, slower than hashmap, only LL in case of collision
        //Hashtable is a thread-safe data structure, meaning it can be safely used by multiple threads concurrently because
        // its methods are synchronized. However, this synchronization comes with performance overhead,
        // as threads must acquire locks to access the table, potentially leading to slower performance
        // compared to non-thread-safe alternatives like HashMap.

        System.out.println("value for key 2 is "+ hashTable.get(2));
        hashTable.remove(1);
        System.out.println("after removing key is "+ hashTable);

    }
}
