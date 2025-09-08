package Java8Features.DefaultMethods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInitialization {

    public static void main(String[] args) {

        List<String> values = List.of("One", "Two", "Three");
        Stream stream1 = values.stream();
        stream1.forEach(s -> System.out.print(s + " "));


        String[] names = {"One", "Two", "Three"};
        Stream<String> stream2 = Arrays.stream(names);
        stream2.forEach(s -> System.out.print(s + " "));

         Stream<String> stream3 = Stream.of("One", "Two", "Three");
         stream3.forEach(s -> System.out.print(s +  " "));

         Stream<String> stream4 = Stream.generate(() -> "One");

         Stream.Builder<String> streamBuilder = Stream.builder();

         Stream<String> stream6 = Stream.empty();

         System.out.println();

         List<Employee> employees = employeeList();
         List<String> empNames = new ArrayList<String>();
         for(Employee emp : employees){
            empNames.add(emp.getName());
         }

         System.out.println(empNames);

         // find all employees
         List<String> allemployeeNames = employees.stream().map(emp -> emp.getName()).toList();
         System.out.println(allemployeeNames);

         // find all emp salaries
         List<String> allemployeeSalary = employees.stream().
                 filter(emp -> emp.getSalary() > 20000).map(emp -> emp.getName()).toList();
         System.out.println(allemployeeSalary);

         // find all emp gender
         List<String> allEmployeeGender =  employees.stream()
                 .filter(emp -> emp.getGender().equalsIgnoreCase("male")).map(emp -> emp.getGender()).toList();
         System.out.println(allEmployeeGender);

         // find all unique names
        List<String> uniqueName = employees.stream().filter(emp -> emp.getName()).distinct().toList();
         System.out.println(uniqueName);

         // find all emp having sal > 1000
         long count = employees.stream().filter(emp -> emp.getSalary() > 1000).count();
         System.out.println(count);

         // find first 3 employee
         List<Employee> first3Emp = employees.stream().limit(3).toList();
         System.out.println(first3Emp);

         // skip first 3 employees
        List<Employee> exceptFirst3emp = employees.stream().skip(3).toList();
        System.out.println(exceptFirst3emp);

        boolean result = employees.stream().anyMatch(emp -> emp.getSalary() < 10000);
        System.out.println(result);

        result = employees.stream().noneMatch(emp -> emp.getSalary() > 30000);
        System.out.println(result);

        // sort by ids
        List<Integer> sortedEmpIds = employees.stream().map(emp -> emp.getId()).sorted().toList();
        System.out.println(sortedEmpIds);

        // min salary emp details
        Employee minSalaryEmp = employees.stream().min  ((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println("min salary is " + minSalaryEmp.getSalary());

        // max salary emp details
        Employee maxSalaryEmp = employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println("max salary is " + maxSalaryEmp.getSalary());

        // average salary of employees
        double avgSalary = employees.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble();
        System.out.println("avg salary is "+ avgSalary);

        // peek method of employee
        List<Employee> empObj = employees.stream().filter(emp -> emp.getId() > 4).peek(System.out::println).toList();
        System.out.println(empObj.get(0).getId());

        //Uses multiple cores (CPU cores) for faster processing (especially for large data sets). Parallel stream — processes elements concurrently using multiple threads
        List<Employee> empDetails = employees.parallelStream().filter(emp -> emp.getSalary() > 5000).toList();

        for(Employee e : empDetails){
            System.out.print(e.getName() + "  ");
        }

        //use collectors to return list of emp names
        List<String> empNameDetails = employees.stream().filter(emp -> emp.getId() > 1).map(Employee::getName).collect(Collectors.toList());
        System.out.println(empNameDetails);


        // groupingBy. get avg salary for each gender
        Map<String, Double> avgSalaryDeptWise = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        // count(). get count of employeee gender wise
        Map<String, Long> countOfEmpGenderWise = employees.stream().collect(Collectors.groupingBy(
           Employee::getGender,
           Collectors.counting()
        ));

        System.out.println(countOfEmpGenderWise);

        // summing all emp salaries
        System.out.println(employees.stream().collect(Collectors.summingDouble(Employee::getSalary)));

        // provides summary of diff salaries
        System.out.println(employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));

        Map<String, Double> salaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.summingDouble(Employee::getSalary)));


        // finding max id of employees
        Employee minIdEmp = employees.stream().min((e1, e2) -> (int) (e1.getId() - e2.getId())).get();

        Employee maxIdEmp = employees.stream().max((e1, e2) -> (int) (e1.getId() - e2.getId())).get();
        System.out.println("min id is "+ minIdEmp.getId());

    }

    public static List<Employee> employeeList(){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "rachit", "male", 25000));
        employeeList.add(new Employee(2, "arun", "female", 5000));
        employeeList.add(new Employee(3, "kavita", "female", 525000));
        employeeList.add(new Employee(4, "mukesh", "male", 250));
        employeeList.add(new Employee(5, "latika", "male", 258990));

        return employeeList;

    }

}
