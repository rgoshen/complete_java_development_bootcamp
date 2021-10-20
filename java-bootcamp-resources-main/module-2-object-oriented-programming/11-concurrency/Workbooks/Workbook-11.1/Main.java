import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class Main {

    static final String SALES = "data/sales.csv"; //Use backslash Windows users

    static double furniture = 0.0;
    static double technology = 0.0;
    static double officeSupplies = 0.0;
    static double total = 0.0;

    public static void main(String[] args) {

        int nThreads = 4;

        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());
            //calculate average sales of "Furniture" here
            // FutureTask<Double> future2 = new FutureTask<>(() -> average(path, "Furniture"));
            // Thread thread2 = new Thread(future2);
            Future<Double> future2 = executor.submit(() -> average(path, "Furniture"));
            
            //calculate average sales of "Technology" here
            // FutureTask<Double> future3 = new FutureTask<>(() -> average(path, "Technology"));
            // Thread thread3 = new Thread(future3);
            Future<Double> future3 = executor.submit(() -> average(path, "Technology"));
            
            //calculate average sales of "Office Supplies" here
            // FutureTask<Double> future4 = new FutureTask<>(() -> average(path, "Office Supplies"));
            // Thread thread4 = new Thread(future4);
            Future<Double> future4 = executor.submit(() -> average(path, "Office Supplies"));
            
            //calculate total average of sales here
            // FutureTask<Double> future5 = new FutureTask<>(() -> totalAverage(path));
            // Thread thread5 = new Thread(future5);
            Future<Double> future5 = executor.submit(() -> totalAverage(path));
            
            // thread2.start();
            // thread3.start();
            // thread4.start();
            // thread5.start();

            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your name to access the Global Superstore dataset: ");
            String name = scan.nextLine();

            try {
                // thread2.join();
                // thread3.join();
                // thread4.join();
                // thread5.join();

                furniture = future2.get();
                technology = future3.get();
                officeSupplies = future4.get();
                total = future5.get();

                System.out.println("\nThank you " + name + ". The average sales for Global Superstore are:\n");
                System.out.println("Average Furniture Sales: " + furniture);
                System.out.println("Average Technology Sales: " + technology);
                System.out.println("Average Office Supplies Sales: " + officeSupplies);
                System.out.println("Total Average: " + total);
            // } catch (InterruptedException e) {
            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                executor.shutdown();
            }

            scan.close();
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Function name: average
     * @param path (Path)
     * @param category (String)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three String values.
     *   3. Filters every value by the @param category
     *   4. Maps every element in the stream to a double (price * quantity).
     *   5. Applies the terminal operation average.
     *   6. Returns the average as double.
     * 
     */
    public static double average(Path path, String category) {
        try {
            return Files.lines(path)
                .skip(1)
                .map((line)->line.split(","))
                .filter((values)->values[0].equals(category))
                .mapToDouble((values)->Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average().getAsDouble();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return 0.0;
        }
    }


    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */
    public static double totalAverage(Path path) {
        try {
            return Files.lines(path)
                .skip(1)
                .map((line)->line.split(","))
                .mapToDouble((values)->Double.parseDouble(values[1]) * Double.parseDouble(values[2]))
                .average().getAsDouble();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return 0.0;
        }
    }

}
