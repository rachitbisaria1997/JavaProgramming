package Collections.SetDemo;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArray {

    public static void main(String[] args) {

                // A thread-safe Set implementation backed by CopyOnWriteArrayList.
                //Designed for use cases where reads are frequent and writes (add/remove) are rare.
                // Every write (add/remove) creates a new copy of the underlying array.
                // Ideal for scenarios where you need concurrent read access without locks.

        Set<String> set  = new CopyOnWriteArraySet<>();
        set.add("apple");
        set.add("banana");
        set.add("Orange");

        for(String fruit : set){
            //// Safe to modify during iteration.. it will not throw ConcurrentModificationException
            if(fruit.equals("banana")){
                set.remove("banana");
            }

        }
        // on read, reads are lock free and fast.
        // on write (add/remove/set) - it takes a lock, clones the entire array applies mutation to clone then sets reference to new array

    }

}
