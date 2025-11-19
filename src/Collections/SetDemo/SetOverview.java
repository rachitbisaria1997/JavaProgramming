package Collections.SetDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(15);
        set.add(25);
        set.add(30);

        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.remove(12));

        System.out.println(set.isEmpty());

        set.clear();

        // for thread safety use concurrent skip list
        // it is Fail-Fast Iterator
        Set<Integer> set1 = new ConcurrentSkipListSet<>();
        // Stores unique elements (no duplicates allowed).

        //Example: When you do hashSet.add(obj), internally, it does something like hashMap.put(obj, PRESENT) where PRESENT is a dummy object.
        // Each object’s hashCode() is used to compute the bucket index in the internal array (hash table).
        // If two objects have the same hash code (collision), they are stored in the same bucket (a linked list or a balanced tree).
        //
        //To check for true equality (no duplicates), equals() is used to compare the actual objects.

    }
}
