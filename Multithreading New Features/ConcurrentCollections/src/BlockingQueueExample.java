
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // BlockingQueue with a capacity of 5
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer thread
        Thread producer = new Thread(new Producer(queue));
        // Consumer thread
        Thread consumer = new Thread(new Consumer(queue));

        // Start both threads
        producer.start();
        consumer.start();
    }
}

// Producer Class
class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Producing: " + i);
                queue.put(i); // Blocks if the queue is full
                Thread.sleep(500); // Simulate time to produce
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer finished producing.");
    }
}

// Consumer Class
class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = queue.take(); // Blocks if the queue is empty
                System.out.println("Consuming: " + item);
                Thread.sleep(1000); // Simulate time to consume
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

