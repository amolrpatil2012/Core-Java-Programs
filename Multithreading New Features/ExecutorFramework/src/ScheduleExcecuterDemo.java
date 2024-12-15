import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduleExcecuterDemo
{
    public static void main(String[] args) {
          // Create a ScheduledExecutorService with a pool of 1 thread
          ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

        // Schedule a task to run after an initial delay
        scheduledExecutor.schedule(() -> {
            System.out.println("Task executed after 3 seconds delay. Thread: " 
                    + Thread.currentThread().getName());
        }, 3, TimeUnit.SECONDS);

        // Schedule a task to run at a fixed rate
        scheduledExecutor.scheduleAtFixedRate(() -> {
            System.out.println("Task executed at fixed rate. Thread: " 
                    + Thread.currentThread().getName());
        }, 2, 5, TimeUnit.SECONDS); 
        // Initial delay: 2 seconds, then execute every 5 seconds

        // Schedule a task to run with a fixed delay
        scheduledExecutor.scheduleWithFixedDelay(() -> {
            System.out.println("Task executed with fixed delay. Thread: " 
                    + Thread.currentThread().getName());
        }, 1, 4, TimeUnit.SECONDS); 
        // Initial delay: 1 second, then 4 seconds after the previous task ends

        // Let the tasks run for 20 seconds, then shut down the executor
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Shut down the scheduler
        scheduledExecutor.shutdown();
        System.out.println("ScheduledExecutorService has been shut down.");
    }
}