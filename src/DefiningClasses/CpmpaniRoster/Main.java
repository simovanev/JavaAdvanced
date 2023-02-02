package DefiningClasses.CpmpaniRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[0];
           Map<String,Department> departmentMap= new HashMap<>();
           List<Employee> employeeList= new ArrayList<>();
            Employee employee = new Employee(name, salary, position, department);
            if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee.setEmail(email);
                employee.setAge(age);
            } else if (input.length == 5) {
                if (Character.isDigit(input[4].charAt(0))) {
                    int age = Integer.parseInt(input[4]);
                    employee.setAge(age);
                } else {
                    String email = input[4];
                    employee.setEmail(email);
                }

            }

          if (!departmentMap.containsKey(department)){
              departmentMap.put(department,new Department(department,employeeList));
          }else departmentMap.get(department).getEmployee().add(employee);

           Department maxAverage= departmentMap.entrySet().stream()
                   .max(Comparator.comparingDouble(e->e.getValue().getAverageSalary()))
                   .get()
                   .getValue();
            System.out.println("Highest Average Salary: " + maxAverage.getDepartment());
            maxAverage.getEmployee().stream()
                    .sorted((a,b)->Double.compare(b.getSalary(),a.getSalary()))
                    .forEach(e-> System.out.println(e.toString()));

        }

    }


}
