package Collections;

import java.lang.ref.WeakReference;

public class GCDemo {

    public static void main(String[] args) {

        WeakReference<Demo> weakReference = new WeakReference<>(new Demo("apple", "16 pro max"));
        System.out.println(weakReference.get());
        System.gc();
        // GC will clean weak reference
        try{

        }
        catch (Exception e){

        }

        System.out.println(weakReference.get());

    }

}

class Demo{

    String brand;
    String model;

    Demo(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

}
