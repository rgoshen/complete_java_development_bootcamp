import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String yourUsername = scan.nextLine();
        System.out.print("• Password: ");
        String yourPassword = scan.nextLine();

        while (!yourUsername.equals(username) || !yourPassword.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            yourUsername = scan.nextLine();
            System.out.print("• Password: ");
            yourPassword = scan.nextLine();
        }
      
        System.out.println("\nSign in successful. Welcome!");

        scan.close();

        
    }
}
