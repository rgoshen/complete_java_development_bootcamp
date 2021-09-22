import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership.\n");
        System.out.println("• Select option 'b' to buy a car");
        System.out.println("• Select option 's' to sell a car");

        char option = scan.next().charAt(0);

        switch (option) {
            case 'b':
                System.out.println("\nWhat is your budget?");
                int budget = scan.nextInt();

                if (budget >= 10000) {
                    System.out.println("\nGreat! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? (yes or no)");
                    scan.nextLine();
                    String hasInsurance = scan.nextLine();
                    System.out.println("\nDo you have a driver's license? (yes or no)");
                    String hasLicense = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if (hasInsurance.toLowerCase().equals("yes") && hasLicense.toLowerCase().equals("yes")
                            && creditScore >= 660) {
                        System.out.println("\nSold! Pleasure doing business with you");
                    } else {
                        System.out.println("\nWe're sorry. You are not eligible");
                    }
                } else {
                    System.out.println("We don't sell cars under $10,000. Sorry!");
                }
                break;
            case 's':
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we're not interested!");
                }
                break;
            default: System.out.println("Invalid option.");
        }

        scan.close();
    }
}
