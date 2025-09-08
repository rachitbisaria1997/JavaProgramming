package NestedClass;


// below is example of static nested class

class Outer{

    static class StaticNested{
        void display()
        {
            System.out.println("inside static nested class");
        }
    }

}

public class Test {

    public static void main(String[] args){
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.display();
    }
}

// below is example of non static inner class

class OuterEx{
    class InnerEx{
        void show(){
            System.out.println("Inside non-static inner class");
        }
    }
}

 class TestNew{
    public static void main(String[] args) {
        OuterEx outer = new OuterEx();
        OuterEx.InnerEx inner = outer.new InnerEx();
        inner.show();
    }
}