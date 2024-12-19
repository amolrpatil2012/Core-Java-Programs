import java.util.*;

class Student
{
    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                '}';
    }

    public Student(int roll) {
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }

    int roll ;

}
public class Checks {
    public static void main(String[] args) {

        HashMap<String,String> m = new HashMap<>();

    }
}
