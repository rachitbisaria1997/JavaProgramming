package ExceptionPrograms.CustomExceptions.UnCheckedDemo;

public class UncheckedDemo
{
    public static void validateNum(int num) throws MyUncheckedException{
        if(num < 0){
            throw new MyUncheckedException("num must be positive");
        }
    }

    public static void main(String[] args) {

        try {
            validateNum(-5);
        }
        catch (MyUncheckedException e){
            System.out.println("caught unchecked exception "+ e.getMessage());
        }

    }
}
