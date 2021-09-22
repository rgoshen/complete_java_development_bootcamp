import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter two integers (on the same line):");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();

        // System.out.println("Enter two very big integers (on the same line):");
        // long bigNum1 = scan.nextLong();
        // long bigNum2 = scan.nextLong();

        // System.out.println("Enter two decimals (on the same line):");
        // double decimal1 = scan.nextDouble();
        // double decimal2 = scan.nextDouble();

        // System.out.println("Enter two text values (on the same line):");
        // String text1 = scan.next();
        // String text2 = scan.next();

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        // throw away b/c of nextInt delimiter trap
        scan.nextLine();
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();

        scan.close();

        // System.out.println("\tIntegers: " + num1 + " " + num2);
        // System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
        // System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        // System.out.println("\tText: " + text1 + " " + text2);
    }
}
