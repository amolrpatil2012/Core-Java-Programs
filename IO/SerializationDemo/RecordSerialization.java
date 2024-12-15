import java.io.*;

public class RecordSerialization {
    public static void main(String[] args) {
        EmployeeRecord emp = new EmployeeRecord(102, "Jane Doe");

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("record.ser"))) {
            out.writeObject(emp);
            System.out.println("Record serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("record.ser"))) {
            EmployeeRecord deserializedEmp = (EmployeeRecord) in.readObject();
            System.out.println("Deserialized Record: " + deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

record EmployeeRecord(int id, String name) implements Serializable {
    // No need for manual serialization handling
}
