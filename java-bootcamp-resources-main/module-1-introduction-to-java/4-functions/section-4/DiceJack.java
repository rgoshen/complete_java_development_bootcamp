import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter in three numbers between 1 and 6 separated by a space");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than one.  Shutting the game down.");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be greater than six.  Shutting the game down.");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Sum of dice: " + sumDiceRolls);
        System.out.println("Sum of numbers: " + sumOfNumbers);
        
        if (checkForWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry! You lose.");
        }

        scan.close();
    }
    
    /**
     * Function name: rollDice
     * @return (int)
     * 
     * Inside the function:
     *  1. returns a random number between 1 and 6.
     */
    public static int rollDice() {
        double randomNum = (Math.random() * 6) + 1;
        return (int) randomNum;
    }
    
    /**
     * Function name: checkForWin
     * @param sumOfDiceRolls (int)
     * @param sumOfNumbers   (int)
     * 
     * Inside the function:
     *  1. accepts sumOfDiceRolls and sumOfNumbers
     *  2. compares the sums to each other
     *  3. determines the winner
     *  Criteria for winner:
     *   - sumOfDice must be less than sumOfNumbers
     *   - the difference can not be greater than 3
     */
    public static boolean checkForWin(int sumOfDiceRolls, int sumOfNumbers) {

        return (sumOfNumbers > sumOfDiceRolls && sumOfNumbers - sumOfDiceRolls < 3);
    }
}
