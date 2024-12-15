import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BasicSerialization {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", "Engineering");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(emp);
            System.out.println("Employee object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for versioning
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}
