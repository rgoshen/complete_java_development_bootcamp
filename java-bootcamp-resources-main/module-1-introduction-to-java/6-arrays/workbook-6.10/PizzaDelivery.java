import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Java Pizza.");
        System.out.print("How many pizza topping would you like? ");
        int toppingNum = scan.nextInt();
        scan.nextLine();    //to avoid the reference trap

        String[] toppings = new String[toppingNum];

        System.out.println("Great, enter each topping!");

        for (int i = 0; i < toppings.length; i++) {
            System.out.print((i + 1) + ". ");
            toppings[i] = scan.nextLine();
        };

        System.out.println("\nThank you! Here are the toppings your ordered");
        for (int i = 0; i < toppings.length; i++) {
             System.out.println((i + 1) + ". " + toppings[i]);
        };

        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();


         
    }
}
