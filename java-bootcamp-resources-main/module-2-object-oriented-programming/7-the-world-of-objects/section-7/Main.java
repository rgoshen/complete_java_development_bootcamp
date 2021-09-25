import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String buyerRes = "";

        Car[] cars = new Car[]{
            new Car("Nissan", 15999, 2021, "red", new String[] {"tire", "keys"}),
            new Car("Dodge", 24999, 2021, "orange", new String[] {"tire", "keys"}),
            new Car("Nissan", 8999, 2017, "yellow", new String[] {"tire", "keys", "oil filter"}),
            new Car("Honda", 6999, 2015, "green", new String[] {"tire", "keys", "oil filter"}),
            new Car("Mercedes", 38999, 2018, "silver", new String[] {"tire", "keys", "oil filter", "air filter"}),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        buyerRes = scan.nextLine();
        String carType = toTitleCase(buyerRes);
        buyerRes = "";
        System.out.print("Enter your budget: ");
        double budget = scan.nextDouble();
        scan.nextLine();

        int searchResult = dealership.search(carType, budget);

        if (searchResult != 404) {
            buyerRes = scan.nextLine().toLowerCase();
            if (buyerRes.equals("yes")) {
                dealership.sell(searchResult);
            }
        } else {
            System.out.println("Feel free to browse through our collection of cars.\n\n");
            System.out.println(dealership);
        }
    }

    public static String toTitleCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
