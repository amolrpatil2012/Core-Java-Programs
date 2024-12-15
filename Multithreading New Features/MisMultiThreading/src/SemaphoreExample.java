import java.util.concurrent.Semaphore;
/*
 * 
 * Imagine there is a parking lot with only 3 parking spaces. Multiple cars (threads) are trying to park, but only 3 cars can park at the same time
 */
class ParkingLot {
    private Semaphore semaphore;

    public ParkingLot(int slots) {
        // Initialize semaphore with the number of parking slots
        this.semaphore = new Semaphore(slots);
    }

    public void parkCar(String carName) {
        try {
            System.out.println(carName + " is trying to park...");
            // Acquire a permit
            semaphore.acquire();
            System.out.println(carName + " has parked.");

            // Simulate time taken to park
            Thread.sleep((long) (Math.random() * 3000));

            System.out.println(carName + " is leaving the parking lot.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Release the permit
            semaphore.release();
            System.out.println(carName + " has released the parking space.");
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        // Parking lot with 3 parking slots
        ParkingLot parkingLot = new ParkingLot(3);

        // Simulating 6 cars trying to park
        for (int i = 1; i <= 6; i++) {
            String carName = "Car-" + i;
            new Thread(() -> parkingLot.parkCar(carName)).start();
        }
    }
}
