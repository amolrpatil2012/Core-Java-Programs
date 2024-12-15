import java.io.*;

public class CustomSerializationExample {
    public static void main(String[] args) {
        Account account = new Account("user123", "secretPassword");

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.ser"))) {
            out.writeObject(account);
            System.out.println("Account serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.ser"))) {
            Account deserializedAccount = (Account) in.readObject();
            System.out.println("Deserialized Account: " + deserializedAccount);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Account implements Serializable {
    private static final long serialVersionUID = 2L;
    private String username;
    private transient String password; // Won't be serialized

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Custom serialization
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject("ENC-" + password); // Encrypt or customize the password
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.password = ((String) in.readObject()).replace("ENC-", ""); // Decrypt or customize
    }

    @Override
    public String toString() {
        return "Account{username='" + username + "', password='" + password + "'}";
    }
}
