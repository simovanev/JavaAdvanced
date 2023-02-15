package ExamPreparation.cafe;

public class Employee {

    private String name;
    private int age;
    private String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s, %d from %s",name,age,country);
    }
}
