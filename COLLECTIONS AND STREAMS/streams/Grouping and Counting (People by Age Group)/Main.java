import java.util.*;
import java.util.stream.*;
/*
 * 
 * You have a list of Person objects with name and age.
 *  Group people into two categories: those who are 18 years or older and those 
 * who are younger than 18. Count how many people fall into each group.
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 17),
            new Person("Jane", 22),
            new Person("Tom", 16),
            new Person("Lucy", 18)
        );

        Map<Boolean, Long> ageGroups = people.stream()
            .collect(Collectors.partitioningBy(
                p -> p.getAge() >= 18, // Predicate: 18 or older
                Collectors.counting() // Count people in each group
            ));

        System.out.println(ageGroups); // Output: {false=2, true=2}
    }
}
