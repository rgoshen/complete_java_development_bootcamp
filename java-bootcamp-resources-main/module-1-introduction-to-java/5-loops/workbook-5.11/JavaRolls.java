import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int score = 0;

      System.out.println("Let's play Rolling Java.  Type anything to start.");
      scan.nextLine();

      System.out.println("Great, here are the rules:\n");
      System.out.println(" • If you roll a 6 the game stops.");
      System.out.println(" • If you roll a 4 nothing happens.");
      System.out.println(" • Otherwise, you get 1 point.\n");
      System.out.println("You must collect at least 3 point to win.  Enter anything to roll: ");

      while (true) {
        scan.nextLine();
        int roll = rollDice();
        System.out.println("You rolled a " + roll + ".");

        if (roll == 6) {
          System.out.print(" End of game.");
          break;
        } else if (roll == 4) {
          System.out.println("Zero points. Keep rolling.");
          continue;
        } else {
          score++;
          System.out.println("One point. Keep rolling.");
        }
      }

      System.out.println("\nYour score is: " + score);

      if (score >= 3) {
        System.out.println("Wow, that's lucky. You win!");
      } else {
        System.out.println("Tough luck, you lose :(");
      }

      scan.close();
    }
  
  
    /** Task 4
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     *
     */

  public static int rollDice() {
    double randNum = Math.random() * 6 + 1;
    return (int) randNum;
  }
}
