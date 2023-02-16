package ExamPreparation.cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (this.capacity > this.employees.size()) {
            this.employees.add(employee);
        }
    }

    public boolean removeEmployee(String employee) {
        return employees.removeIf(e -> e.getName().equals(employee));

    }

    public Employee getOldestEmployee() {
        return this.employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .reversed())
                .collect(Collectors.toList())
                .get(0);
    }

    public Employee getEmployee(String sara) {
        return this.employees.stream().filter(e->e.getName().equals(sara)).collect(Collectors.toList()).get(0);
    }

    public int getCount() {
        return this.employees.size();
    }

    public String report() {
        String currentEmployee=this.employees
                .stream()
                .map(e->e.toString())
                .collect(Collectors.joining("\n"));
        return String.format("Employees working at Cafe %s:\n%s",this.name,currentEmployee);
    }
}

