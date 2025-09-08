package ExceptionPrograms;

public class ExceptionHandler {

    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }

    private static void method1(){
        method2();
        System.out.println("method1 ended");
    }

    private static void method2(){
        try{
            String str = null;
            str.length();
            System.out.println("method2 ended");
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
        // exception is thrown upwards
        // method2 ended will not be printed
        // Null ppointer exception
        // method1 ended
        // main ended
}
