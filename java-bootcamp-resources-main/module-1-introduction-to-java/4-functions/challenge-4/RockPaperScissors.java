import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String answer = scan.next();

    if (answer.toLowerCase().equals("yes")) {
        System.out.println("\nGreat!\n");
        System.out.println("rock - paper - scissors, shoot!");
        String yourChoice = scan.next();
        yourChoice = yourChoice.toLowerCase();

        if (yourChoice.equals("rock") || yourChoice.equals("paper") || yourChoice.equals("scissors")) {
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("Invalid choice.  Ending the game.");
            System.exit(0);
        }

    } else {
        System.out.println("Darn, some other time...");
    }
        scan.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     *
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

    public static String computerChoice() {
        double randNum = Math.random() * 3;
        int choice = (int) randNum;

        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String)
     *  @return result (String)

     * Inside the function:
     *   1. result is "You win" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     *
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if:
     *
     *       your choice equals computer choice.
     *
     */

    public static String result(String yourChoice, String computerChoice) {

        if((yourChoice.equals("rock") && computerChoice.equals("rock"))
                || (yourChoice.equals("paper") && computerChoice.equals("paper"))
                || (yourChoice.equals("scissors") && computerChoice.equals("scissors")))
            return "It's a tie";

        if ((yourChoice.equals("rock") && computerChoice.equals("scissors"))
                || (yourChoice.equals("paper") && computerChoice.equals("rock"))
                || (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win";
        } else {
            return "You lose";
        }

    }

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     *
     * Inside the function:
     *
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t\t" + yourChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println("\n" + result);
    }
}
