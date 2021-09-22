import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();

        //Task 2 - Print this if the decision is "yes"
        if (decision.toLowerCase().equals("yes")) {
            System.out.println("\nGreat! In one line" + "\nHow much money do you have in your savings?"
                    + "\nAnd, how much do you owe in credit card debt?");
            // Task 3 - Pick up each value
            int savings = scan.nextInt();
            int creditDebt = scan.nextInt();

            System.out.println("\nHow many years have you worked for?");
            // Task 4 - Pick up number of years
            int yearsWorked = scan.nextInt();

            System.out.println("\nWhat is your name?");
            // Task 5 - Pick up the user's name
            scan.nextLine();
            String name = scan.nextLine();

            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.
            if (savings >= 10000 && creditDebt < 5000 && yearsWorked >= 2) {
                System.out.println("\nCongratulations " + name + " You have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }
        } else {
            //Task 2 - Print this if the decision was not "yes"
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}