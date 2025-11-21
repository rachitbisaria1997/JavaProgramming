package Collections.SetDemo;

import java.util.HashSet;

public class EmpHashsetDemo {

    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        Employee e1 = new Employee("rac", 10.0, "HR");
        Employee e2 = new Employee("rac", 10.0, "HR");
        Employee e3 = new Employee("rac", 10.0, "HR");
        Employee e4 = new Employee("rac", 10.0, "HR");

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

//        Each new Employee(...) is a different object in memory, so:
//
//        HashSet will store all 4 objects ..Even if all fields are SAME
        // Because default equals() checks only memory reference.
        // if overdiden, it will be used to compare keys
    }
}
