
interface Animal{
    void sound();
}

public class AnonymousClass {

    Animal dog = new Animal() {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    };

    // dog.sound(); output will be dog barks
//    An anonymous class is a class without a name, created on the fly.
//    It is used when you need a one-time use class, usually for:
//
//    Implementing interfaces quickly. Created using new keyword.
    // No constructor because they have no name.

    // using Thread :-

    Thread t = new Thread(){
        public void run(){
            System.out.println("thread is running ");
        }
    };

    // t.start();
}
