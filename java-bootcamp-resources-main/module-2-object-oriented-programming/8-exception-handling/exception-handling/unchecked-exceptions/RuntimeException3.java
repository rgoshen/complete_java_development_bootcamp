import java.util.Scanner;
public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter an integer: ");
            if (scan.hasNextInt()) {
                System.out.println(scan.nextInt());
                break;
            } else {
                scan.nextLine();
                System.out.println("Not an integer.");
            }
        }

        scan.close();
    }
}
