import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee emp = (Employee) in.readObject();
            System.out.println("Deserialized Employee: " + emp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
