import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
	 * 
	 *  1.) ExecutorService es = Executors.newCachedThreadPool();
	 *  	- going to return an executorService that can dynamically
	 *  		reuse threads
	 *		- before starting a job -> it going to check whether there are any threads that
	 *			finished the job...reuse them
	 *		- if there are no waiting threads -> it is going to create another one 
	 *		- good for the processor ... effective solution !!!
	 *
	 *	2.) ExecutorService es = Executors.newFixedThreadPool(N);
	 *		- maximize the number of threads
	 *		- if we want to start a job -> if all the threads are busy, we have to wait for one
	 *			to terminate
	 *
	 *	3.) ExecutorService es = Executors.newSingleThreadExecutor();
	 *		It uses a single thread for the job
	 *
	 *		execute() -> runnable + callable
	 *		submit() -> runnable
	
	 */
class Task implements Runnable
    {
        private int id;        

        public Task(int id) {
            this.id = id;
        }


        @Override
        public void run() {
            System.out.println("Task with id "+id+" is in work - thread id " + Thread.currentThread().getName());
            long duration = (long)Math.random()*5;
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {            
                e.printStackTrace();
            }
        }
        
    }
class SingleThreadExecutor
{
    
    public static void main(String[] args) {
        // Single Thread Executor executes task one after another

       // ExecutorService executorService = Executors.newSingleThreadExecutor();

       ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i = 0 ; i<5;i++)
            executorService.execute(new Task(i));

    }
}