package Java8Features.DefaultMethods;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String [] args){

        Predicate<Integer> ageCheck = age -> age > 21;

        //A predicate in Java is a functional interface that represents a boolean-valued function of one argument. It belongs to the java.util.function package and is used to test a condition and return either true or false.

        System.out.println(ageCheck.test(32));
        System.out.println(ageCheck.test(20));

        if(ageCheck.test(44)){
            System.out.println("eligible");
        }

        Employee e1 = new Employee();
        e1.setId(111);
        e1.setSalary(27000);

        Predicate<Employee> empSalaryCheck = emp -> emp.getSalary() > 25000;

        // check salary > 25000

        if(empSalaryCheck.test(e1)){
            System.out.println("above 25000");
        }
        else{
            System.out.println("below 25000");
        }

        // check salary > 25000 and employee is female
        Predicate<Employee> femaleCheck = emp -> emp.getGender().equalsIgnoreCase("female");
        e1.setGender("female");

        boolean result = empSalaryCheck.and(femaleCheck).test(e1);
        System.out.println(result);

        result = femaleCheck.negate().test(e1);
        System.out.println(result);


        Predicate<Employee> baseEmp = Predicate.isEqual(e1);

        Employee e2 = new Employee();
        e2.setId(111);
        e2.setSalary(27000);
        result = baseEmp.test(e2);
        System.out.println(result);

    }

}
