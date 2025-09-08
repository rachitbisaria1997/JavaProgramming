package JUnit;

public class MyMath {

    int calculateSum(int [] num){
        int sum = 0;
        for(int i: num){
            sum+= i;
        }
        return sum;
    }

}
