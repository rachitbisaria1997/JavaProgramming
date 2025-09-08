package ExceptionPrograms.CustomExceptions.CheckedDemo;

public class CheckedCustomExceptionExample {


    public static void validateAge(int age) throws MyCheckedException{

        if(age < 18){
            throw new MyCheckedException("age must be over 18");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(15);
        }
        catch (MyCheckedException e){
            System.out.println("caught checked exception "+ e.getMessage());
        }

    }

}
