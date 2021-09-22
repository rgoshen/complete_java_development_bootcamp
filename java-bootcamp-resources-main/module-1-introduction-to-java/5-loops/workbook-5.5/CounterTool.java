import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

      System.out.print("\n 1. Pick a number to count by: ");
      int numBy = scan.nextInt();
      System.out.print(" 2. Pick a number to start counting from: ");
      int numFrom = scan.nextInt();
      System.out.print(" 3. Pick a number to count to: ");
      int numTo = scan.nextInt();

      for (int i = numFrom; i <= numTo; i += numBy) {
         System.out.print(i + " ");
      };

        scan.close();
    }
}
