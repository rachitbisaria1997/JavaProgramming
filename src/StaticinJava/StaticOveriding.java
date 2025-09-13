package StaticinJava;

import Java17Features.PatternMatching;

class Parent{
    static void display(){
        System.out.println("Static method in Parent");
    }
}

class Child  {

    static void display(){
        System.out.println("Static method in Child");
    }
}

public class StaticOveriding {

    public static void main(String[] args) {

        Parent.display(); //Static method in Parent
        Child.display(); // Static method in Child

       // Parent obj = new Child();
        //obj.display();      // Output: Static method in Parent
        // here object to be called is resolved at compile time by compiler because they belong to class not object

        //Static methods belong to the class itself →
        // Cannot participate in runtime polymorphism → Cannot be overridden.

        //Method overriding happens at runtime (dynamic polymorphism).
        // static methods are resolved at runtime hence they cant be overrided


    }
}
