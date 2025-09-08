package Java21Features;

public class PatternMatching{

    public static void main(String[] args) {

        Student student = new Student("rachit", "bisaria");

        if(student instanceof Student){

            String firstName = student.firstName;
            String lastName = student.lastName;
            System.out.println(firstName +" " +lastName);

            System.out.println(firstName);
            System.out.println(lastName);

        }
    }
}
class Student{

    String firstName;
    String lastName;

    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }


    public String lastName() {
        return lastName;
    }

}