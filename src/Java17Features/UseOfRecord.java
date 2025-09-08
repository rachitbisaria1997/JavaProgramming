package Java17Features;

public class UseOfRecord {

    public static void main(String[] args) {

        Person person = new Person("rachit", 25);
        System.out.println(person.name);
        System.out.println(person.age);

    }

    record Person(String name, int age){

    }

}
