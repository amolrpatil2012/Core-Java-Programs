
class SharedData {
    boolean running = true; // shared variable without volatile
}
/*
 * 
 * The "Thread-1 stopped..." line may never appear because:

Thread t1 may cache the value of running and not see the change made by the main thread.
The running variable is not visible across threads.

Adding the volatile keyword ensures visibility:
 */
public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();

        // Thread-1 keeps checking the "running" variable
        Thread t1 = new Thread(() -> {
            System.out.println("Thread-1 started...");
            while (data.running) {
                // Busy wait (empty body)
            }
            System.out.println("Thread-1 stopped...");
        });

        t1.start();

        // Main thread sleeps for 2 seconds and then changes the "running" variable
        Thread.sleep(2000);
        System.out.println("Main thread stopping Thread-1...");
        data.running = false; // Update shared variable
    }
}
