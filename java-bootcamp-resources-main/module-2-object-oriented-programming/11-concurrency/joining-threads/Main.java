import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {

    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;

    static double result = 0;

    public static void main(String[] args) {

        // Runnable runnable = () -> result = generateNumber();
        // Thread thread = new Thread(runnable);
        Callable<Double> callable = () -> generateNumber();
        FutureTask<Double> future = new FutureTask<>(callable);
        Thread thread = new Thread(future);

        thread.start();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter in a name to generate a number: ");
        scan.nextLine();
        scan.close();
        
        try {
            // thread.join();
            result = future.get();
        // } catch (InterruptedException e) {
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        double precision = difference(result);
        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + precision);
    }

    /**
     * Function name: generateNumber
     * @return double
     * 
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     * 
     */
    public static double generateNumber() {
        double number = Math.random();
        double difference = difference(number);

        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number);
        }

        return number;
    }

    public static double difference(double number) {
        return Math.abs(TARGET - number);
    }

}
