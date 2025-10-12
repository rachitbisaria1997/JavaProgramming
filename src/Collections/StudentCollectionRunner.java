package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescendingStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2)5 {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class StudentCollectionRunner {

    public static void main(String[] args) {

        List<Student> students = List.of(new Student(1, "rachit"),

                new Student(100, "adam"),
                new Student(140, "eve"));

        List<Student> studentsAl = new ArrayList<>(students);

        System.out.println(students);

        //Collections.sort(students);

//        for(Student s : students){
//            System.out.println(s);
//        }

        Collections.sort(studentsAl, new DescendingStudentComparator());
        System.out.println("descendingStudentComparator"+ studentsAl);
    }

}
