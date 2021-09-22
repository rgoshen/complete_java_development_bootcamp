import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Welcome.  Thank you for taking the survey.");

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\n" + name + ", how much do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\n" + name + ", how much do you spend on fast food?");
        double fastFoodPrice = scan.nextDouble();
        counter++;

        System.out.println("\n" + name + ", how many times do you buy coffee every week?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\n" + name + ", how many times do you buy fast food every week?");
        int fastFoodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " + (fastFoodPrice / coffeePrice) + " times your coffee expenses.");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee.");
        System.out.println("Weekly, you spend $" + (fastFoodAmount * fastFoodPrice) + " on food.");

        scan.close();
    }
}
