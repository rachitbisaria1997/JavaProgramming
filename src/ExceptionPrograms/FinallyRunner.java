package ExceptionPrograms;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            sc = new Scanner(System.in);
            int[] nums = {12,3,4,5};
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("before scanner close");
            if(sc!= null){
                sc.close();
            }

        }
        System.out.println("before closing out main");
        //to ensure scanner.close() is called just before closing out main also
    }

}
