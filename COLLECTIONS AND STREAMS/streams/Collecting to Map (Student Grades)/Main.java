import java.util.*;
import java.util.stream.*;
/*
 * 
 * You have a list of Student objects with name and grade. Create a map 
 * where the student's name is the key and their grade is the value.
 */
class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85.5),
            new Student("Bob", 78.0),
            new Student("Charlie", 92.3),
            new Student("David", 69.8)
        );

        Map<String, Double> studentGradeMap = students.stream()
            .collect(Collectors.toMap(
                Student::getName, // Key: student name
                Student::getGrade // Value: student grade
            ));

        System.out.println(studentGradeMap); // Output: {Alice=85.5, Bob=78.0, Charlie=92.3, David=69.8}
    }
}
