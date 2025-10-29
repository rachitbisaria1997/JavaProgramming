package Modifiers;

class Parent {

     protected void show() {
         System.out.println("Protected method");
     }
}

class Child extends Parent{
     void access(){
         show(); // accessible
     }
}

//Accessible within the same package and by subclasses (even in other packages)
//applied to Methods, variables, constructors