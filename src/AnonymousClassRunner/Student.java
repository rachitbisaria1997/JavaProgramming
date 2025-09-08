package AnonymousClassRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        return o.marks - this.marks;
    }

    @Override
    public String toString(){
        return id + " - " + name + " - " + marks;
    }
}

class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ravi", 85));
        students.add(new Student(2, "Ankit", 92));
        students.add(new Student(3, "Meena", 76));

        // Sorting using Comparable
        Collections.sort(students);

        System.out.println("Sorted Students (by marks):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}