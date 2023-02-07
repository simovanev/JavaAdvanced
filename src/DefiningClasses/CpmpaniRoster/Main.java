package DefiningClasses.CpmpaniRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>> departmentList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
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
            departmentList.putIfAbsent(department, new ArrayList<>());
            departmentList.get(department).add(employee);
        }
        String maxDepartment = null;
        double max = 0;
        for (Map.Entry<String, List<Employee>> item : departmentList.entrySet()) {
            double average = item.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
            if (average > max) {
                max=average;
                maxDepartment = item.getKey();
            }
        }
        System.out.printf("Highest Average Salary: %s%n",maxDepartment);
        departmentList.get(maxDepartment).stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(e-> System.out.println(e));




    }
}
