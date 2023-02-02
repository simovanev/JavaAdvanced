package DefiningClasses.CpmpaniRoster;

public class Employee {

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;


    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;

    }

    @Override
    public String toString() {
        //Peter 120.00 peter@abv.bg 28
        return String.format("%s %.2f %s %d", name,salary,email,age);
    }
}
