import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person
{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(String name,int age ) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class MethodRef {

    public static int compareByAge ( Person p1,Person p2)
    {
        return p1.age-p2.age;
    }
    public static int compareByName(Person p1,Person p2)
    {
        return  p1.name.compareTo(p2.name);
    }
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        // Adding elements to above List
        // using add() method
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));

        Collections.sort(personList,MethodRef::compareByAge);
       // System.out.println(personList);
        //personList.forEach(s->System.out.println(s));

        personList.forEach(System.out::println);
    }

}
