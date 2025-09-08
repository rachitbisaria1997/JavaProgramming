package Java8Features.DefaultMethods;

import java.util.Arrays;

public class MethodReferenceDemoTwo {

    public static void main(String[] args) {

        EmployeeValidation validemployee = Employee::validateEmpDetails;

        Employee employee1 = new Employee();

        System.out.println(validemployee.isValidEmployee(employee1));

        Employee employee2 = new Employee();
        employee2.setId(10);
        employee2.setName("rach");
        employee2.setGender("male");
        employee2.setSalary(1000);

        System.out.println(validemployee.isValidEmployee(employee2));

        String[] values = {"dilip", "rachit", "spring", "methods"};

        Arrays.sort(values, (o1, o2) -> o1.compareToIgnoreCase(o2));

        Arrays.sort(values, String::compareToIgnoreCase);

        for(String word : values){
            System.out.print(word + " ");
        }

        int sum = (int) Arrays.stream(new int[] {1,2,3}).filter(n -> n % 2 == 1).count();
        System.out.println(sum);
    }

}
