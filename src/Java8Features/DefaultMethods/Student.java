package Java8Features.DefaultMethods;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

List<Student> students = List.of(
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 75),
            new Student("David", 92),
            new Student("Eve", 88)
);

List<Integer> sortedDistinctMarks = students.stream().map(Student::getMarks).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

int secondHighestMarks = sortedDistinctMarks.get(1);

List<String> names = students.stream().filter(s -> s.getMarks() == secondHighestMarks).map(Student::getName).collect(Collectors.toList());

System.out.println("Student(s) with second highest marks:");

names.forEach(System.out::println);

