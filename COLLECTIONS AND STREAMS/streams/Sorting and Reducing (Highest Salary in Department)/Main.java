import java.util.*;
/*
 * You have a list of Employee objects, each with a name, salary,
 *  and department. 
 * Find the employee with the highest salary in a given department.
 * 
 * 
 */

class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 60000, "HR"),
            new Employee("Jane", 75000, "HR"),
            new Employee("Tom", 50000, "IT"),
            new Employee("Lucy", 80000, "IT")
        );

        // Find highest-paid employee in the "IT" department
        Optional<Employee> highestPaid = employees.stream()
            .filter(e -> e.getDepartment().equals("IT")) // Filter by department
            .max(Comparator.comparing(Employee::getSalary)); // Get the max salary

        highestPaid.ifPresent(System.out::println); // Output: Lucy: 80000.0
    }
}
