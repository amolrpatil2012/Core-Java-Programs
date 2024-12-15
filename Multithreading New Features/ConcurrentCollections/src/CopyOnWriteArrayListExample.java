
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Creating CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements to the list
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        System.out.println("Initial List: " + list);

        // Creating a thread to iterate over the list
        Thread readThread = new Thread(() -> {
            System.out.println("Reading from List:");
            for (String item : list) {
                System.out.println(item);
                try {
                    Thread.sleep(100); // Simulate processing delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Creating a thread to modify the list
        Thread writeThread = new Thread(() -> {
            System.out.println("Modifying List...");
            list.add("Element4");
            list.add("Element5");
            System.out.println("List modified.");
        });

        // Start both threads
        readThread.start();
        writeThread.start();

        // Wait for threads to complete
        try {
            readThread.join();
            writeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final list state
        System.out.println("Final List: " + list);
    }
}
