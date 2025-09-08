package Java8Features.DefaultMethods;

import com.sun.net.httpserver.HttpServer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class RestControllerStreams {

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        Map<Integer, List<Employee>> empMap = repo.findAll().stream().collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.toList()));
        // group by age and convert all emp to a list
        return new ResponseEntity<>(empMap, HttpStatus.OK);

    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        Map<Integer, Set<Employee>> empMap = repo.findAll().stream().collect(Collectors.groupingBy(emp -> emp.getAge(), TreeMap::new,Collectors.toSet()));
        // group by age and convert all employees to a set

        return new ResponseEntity<>(empMap, HttpStatus.OK);
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<Integer> ages = repo.findAll().stream().map(emp -> emp.getAge()).collect(Collectors.toList());
        return new ResponseEntity<>(ages, HttpStatus.OK);

    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<Integer> ages = repo.findAll().stream().map(emp -> emp.getAge()).collect(Collectors.toList());

        IntSummaryStatistics summary = ages.stream().mapToInt(x -> x).summaryStatistics();

        return new ResponseEntity<>(summary.getMin(), HttpStatus.OK);

    }

    // sort by ages

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<Integer> ages = repo.findAll().stream().map(emp -> emp.getAge()).sorted().collect(Collectors.toList());
        List<Integer> sliceages = ages.stream().skip(1).limit(2).collect(Collectors.toList());
        // skips first and find ext 2 elements
        return new ResponseEntity<>(sliceages, HttpStatus.OK);

    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<String> namesList = repo.findAll().stream().map(emp -> emp.getName()).sorted().collect(Collectors.toList());
        String names = namesList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        return new ResponseEntity<>(names, HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee newEmployee){

        Employee employee = repo.save(newEmployee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<String> namesInRepo = repo.findAll().stream().map(emp -> emp.getName()).collect(Collectors.toList());

        List<String> duplicateNames = namesInRepo.stream().filter(name -> Collections.frequency(namesInRepo, name) > 1)
                .distinct().collect(Collectors.toList());

        return new ResponseEntity<>(duplicateNames, HttpStatus.OK);

        // find all duplicate names
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<String> namesInRepo = repo.findAll().stream().map(emp -> emp.getName()).collect(Collectors.toList());
        Map<String , Long> mapOfNames = namesInRepo.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> names = mapOfNames.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
        return new ResponseEntity<>(names, HttpStatus.OK);

        // find all names along with their frequency if freq is > 1
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<?> getAll(){

        List<Integer> ages = repo.findAll().stream().map(emp -> emp.getName()).collect(Collectors.toList());
        Map<String, Long> mapOfNames = namesInRepo.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return new ResponseEntity<>(mapOfNames, HttpStatus.OK);

    }

    @GetMapping(path = "/id/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        Optional<Employee> e = repo.findById(id);

        if(!e.isEmpty()){
            //String name = Optional.ofNullable(e.get().getName()).orElse(callMe());
            //String newName = Optional.ofNullable(e.get().getName()).orElseGet(() -> callMe());

            String name = Optional.ofNullable(e.get().getName()).orElseThrow(() -> new IllegalArgumentException("name is not found"));

            return new ResponseEntity<>(name, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("emp with id is not present", HttpStatus.OK);
        }
    }

    private String callMe(){
        return "Anonymous";
    }


}

public class Employee{

    private int id;
    private long salary;

    public Employee(int id, long salary){
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

public class Java8Demo{

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee(1, 500));
        empList.add(new Employee(2, 1500));
        empList.add(new Employee(3, 2500));
        empList.add(new Employee(4, 3500));
        empList.add(new Employee(5, 4500));

        // gives in reverse order
        List<Employee> empSortedList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());

        System.out.println(empSortedList);

        // find top 3 salaried employees
        List<Employee> empSortedList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                                        .limit(3)
                                       .collect(Collectors.toList());

        // find emp by name else give a random value

        Optional<Employee> e = repo.findById(id);
        if(!e.isEmpty()){

            String name = Optional.ofNullable(e.getName()).orElse(callMe());
            // other way is below
            String nName = Optional.ofNullable(e.get().getId()).orElse("anonymous");
            return new ResponseEntity<>(nName, HttpStatus.OK);

        }
        else{
            return new ResponseEntity<>("sorry employee is not present", HttpStatus.OK);
        }

        private String callMe(){
            System.out.println("i am called");
            return "anonymous";
        }

        // return a string else throw an exception

        Optional<Employee> e = repo.findById(id);
        if(!e.isEmpty()){
            String name = Optional.ofNullable(e.getName()).orElseThrow(() -> new IllegalArgumentException("this is some exception"));
            return new ResponseEntity<>(name, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("emp with given id is not present", HttpStatus.OK);
        }


        @GetMapping(path = "/id/{id}")
        public ResponseEntity<?> getById(@PathVariable Integer id){

            Optional<Employee> e = repo.findById(id);
            if(!e.isEmpty()){

                Optional<String> name = Optional.of(e.get().getName());
                if(name.isPresent()){
                    return new ResponseEntity<>(name.get().toUpperCase(), HttpStatus.OK);
                }
                else{
                    return new ResponseEntity<>("name is null", HttpStatus.NOT_FOUND);
                }

                // other way is
                name.ifPresentOrElse(n -> System.out.println("name is present "+ n), () -> System.out.println("name is not present"));

            }
            else{
                return new ResponseEntity<>("emp with given id is not present", HttpStatus.NOT_FOUND);
            }

        }


        @GetMapping(path = "/findAll")
        public ResponseEntity<Boolean> getAll(){
            // any employee should have name having code inside
            Boolean isContains = repo.findAll().stream().anyMatch(emp -> emp.getName().contains("code"));
            return new ResponseEntity<>(isContains, HttpStatus.OK);

        }

        @GetMapping(path = "/findAll")
        public ResponseEntity<Boolean> getAll(){

            Boolean itContains = repo.findAll().stream().allMatcb(emp -> emp.getName().contains("new"));
            return new ResponseEntity<>(itContains, HttpStatus.OK);

        }

        @GetMapping(path = "/findAll")
        public ResponseEntity<List<Employee>> getAll(){

            List<Employee> emps = repo.findAll().stream().limit(2).collect(Collectors.toList());
            return new ResponseEntity<>(emps, HttpStatus.OK);

        }

        //return 1 employee
        @GetMapping(path = "/findAll")
        public ResponseEntity<List<Employee>> getFirstEmployee(){

            Employee emp = repo.findAll().stream().filter(emp -> emp.getName().contains("raj")).findFirst().get();
            return new ResponseEntity<>(emps, HttpStatus.OK);

        }

        @GetMapping(path = "/findAll")
        public ResponseEntity<Boolean> getAll(){

            boolean itContains = repo.findAll().stream().anyMatch(emp -> emp.getName().contains("rachit"));
            return new ResponseEntity<>(itContains, HttpStatus.OK);

        }


    }


}