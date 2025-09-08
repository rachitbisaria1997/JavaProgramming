package ExceptionPrograms.UncheckedExceptionDemo;

public class NullPtrDemo {

    public static void main(String[] args) {

        String str = null;

        try{
            int len = str.length();
            System.out.println("length "+ len);
        }
        catch (NullPointerException e){
            System.out.println("caught an unchecked exception "+ e.getMessage());
        }

        // System.out.println("Program continues after handling NullPointerException.");
        //Program continues after handling NullPointerException.
    }

}
