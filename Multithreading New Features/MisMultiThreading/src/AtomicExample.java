import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    int count = 0;

    public void increment() {
        count++; // Not thread-safe
    }
}
class AtomicCounter {
    AtomicInteger count = new AtomicInteger(0); // Atomic variable

    public void increment() {
        count.incrementAndGet(); // Atomic increment
    }
}
public class AtomicExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}
