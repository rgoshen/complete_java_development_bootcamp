import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

import javax.xml.crypto.URIReferenceException;

public class Main {

    static String[] files = new String[] { "data/sales1.csv", "data/sales2.csv", "data/sales3.csv"};

    static int sampleSize = 0;
    static int quantitySold = 0;


    public static void main(String[] args) throws Exception {

        // execute tasks here
        int nThreads = 3;
        CountDownLatch latch = new CountDownLatch(nThreads);
        ReentrantLock lock = new ReentrantLock();
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        for (String file : files) {
            executor.submit(() -> increment(file, latch, lock));
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name to access the Global Superstore data: ");
        String name = scan.nextLine();
        System.out.println("\nThank you " + name + ".\n");
        scan.close();

        latch.await();
        executor.shutdown();

        System.out.println("The sample size is: " + sampleSize);
        System.out.println("The quantity sold is: " + quantitySold);

    }

    /**
     * Function name: increment
     * @param file
     *
     * Inside the function:
     *   1. Runs through every line in the file.
     *   2. Maps each element in the stream to a quantity value.
     *   3. Increments sampleSize and quantitySold.
     */
    public static void increment(String file, CountDownLatch latch, ReentrantLock lock) {
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(file).toURI());

            Files.lines(path)
                .skip(1)
                .mapToInt((line) -> Integer.parseInt(line.split(",")[2]))
                .forEach((quantity) -> {
                    lock.lock();
                    sampleSize++;
                    quantitySold += quantity;
                    lock.unlock();
                });
        } catch (URISyntaxException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        latch.countDown();
    }

}
