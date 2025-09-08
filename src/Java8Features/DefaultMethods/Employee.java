package Java8Features.DefaultMethods;

public class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int id;
    private String name;
    private String gender;
    private double salary;

    Employee(){
        System.out.println("this is employee constructor with no data");
    }

    public Employee(int id, String name, String gender, double salary){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    Employee(int eid, String name){
        System.out.println("with data");
        this.id = eid;
        this.name = name;
    }

    Employee(int id){
        System.out.println("this is only id initialized");
        this.id = id;
    }

    static boolean validateEmpDetails(Employee employee){
        if(employee.getId() != 0 && employee.getName() != null){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {



    }

}
