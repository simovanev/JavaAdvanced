package DefiningClasses.CpmpaniRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> depEmployees;

    public Department(String name) {
        this.name = name;
        this.depEmployees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getDepEmployees() {
        return depEmployees;
    }
}
