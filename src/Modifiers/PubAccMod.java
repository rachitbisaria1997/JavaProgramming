package Modifiers;

 class PubAccMod {

    public int data = 10;
    public void display(){
        System.out.println("public method");
    }

}

//Accessible from anywhere
//applies to Classes, methods, variables, constructors

class Demo {
    public static void main(String[] args) {

        PubAccMod obj = new PubAccMod();
        obj.display();
        System.out.println(obj.data);

    }
}