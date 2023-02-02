package DefiningClasses.CpmpaniRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
   private String department;
   private List<Employee> employee;




     public double  getAverageSalary(){
           return  employee.stream().mapToDouble(Employee::getSalary).average().getAsDouble();

   }

   public String getDepartment() {
      return department;
   }

   public void setEmployee(List<Employee> employee) {
      this.employee = employee;
   }

   public List<Employee> getEmployee() {
      return employee;
   }

   public Department(String department, List<Employee> employee) {
      this.department = department;
      this.employee = new ArrayList<>();

   }
}
