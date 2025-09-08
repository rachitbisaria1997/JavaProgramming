package JavaFeatures.MySortingUtil;

public class RecordRunner {

    record Person(String name, String email) {

        Person(String name, String email){
            this.name = name;
            this.email = email;
        }
    };

    public static void main(String[] args) {

        // added in java 14

        Person person1 = new Person("rachit", "rac@gmail.com");
        Person person2 = new Person("rachit", "rac@gmail.com");
        Person person3 = new Person("rachifwt", "rachi@gmail.com");

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

    }

}
