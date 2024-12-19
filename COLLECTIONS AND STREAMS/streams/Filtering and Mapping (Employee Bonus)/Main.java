/*
 * 
 * You have a list of Employee objects, 
 * each with a name, salary, and yearsOfService. 
 * You need to filter employees who have worked for more than 5 years,
 * increase their salary by 10%, 
 * and collect their names and updated salaries into a new list.
 */

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    double salary;
    int yearsOfService;

    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 50000, 6),
            new Employee("Jane", 45000, 4),
            new Employee("Tom", 55000, 7),
            new Employee("Lucy", 40000, 5)
        );

        List<Employee> updatedSalaries = employees.stream()
            .filter(e -> e.getYearsOfService() > 5) // Filter employees with > 5 years of service
            .map(e -> {
                e.setSalary(e.getSalary() * 1.10); // Increase salary by 10%
                return e;
            })
            .collect(Collectors.toList());

        updatedSalaries.forEach(System.out::println); // Output: John: 55000.0, Tom: 60500.0
    }
}
