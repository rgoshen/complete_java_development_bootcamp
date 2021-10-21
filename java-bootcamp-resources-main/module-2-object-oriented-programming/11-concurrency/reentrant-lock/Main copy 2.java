import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static int counter = 0;

    public static void main(String[] args) {

        int tries = 55;

        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        CountDownLatch latch = new CountDownLatch(tries);
        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < tries; i++) {
            executor.submit(() -> task(lock, latch));
        }

        try {
            latch.await();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            executor.shutdown();
        }

        System.out.println(counter);
    }

    public static void task(ReentrantLock lock, CountDownLatch latch) {
        //some really long operations that need to run in the background...
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            counter++; // there happens to be a line that updates the counter variable.
            lock.unlock();
        }
        latch.countDown();
        //more really long operations...
    }

}
