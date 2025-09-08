package Java8Features.DefaultMethods;

public class ConstructorReference {

    public static void main(String[] args) {

        GetEmployeeInstance employee = Employee::new;
        //Employee emp = employee.getEmployee(100, "rachit bisaria");

        Employee emp = employee.getEmployee(100);

        System.out.println(emp.getId());
        //System.out.println(emp.getName());

        // It allows you to create an instance of a class using a reference to its constructor, instead of using a lambda expression.
    }
}
