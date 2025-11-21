package Collections.SetDemo;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    private String name;
    private double salary;
    private String department;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return name.equals(e.name) &&
                salary == e.salary &&
                department.equals(e.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department);
    }
    //Now HashSet checks values of fields as overrided equals method
    //HashSet will store:
    //Only 1 object  will be created if all 4 objects have same name, salary, department, dateOfJoining
    //4 objects if any field is different between them
}
