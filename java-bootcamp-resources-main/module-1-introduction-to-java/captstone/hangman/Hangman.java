import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPlay = true;
        int solved = 0;
        int rip = 0;

        // user start game
        System.out.println("Welcome to Java Hangman.  Press 'e' to exit or 'b' to begin the game.");
        char option = scan.nextLine().charAt(0);

        if (option == 'e' || option == 'E') {
            System.out.println("exiting...");
            System.exit(0);
        }

        while (isPlay) {

            char[] guesses = new char[26];
            char[] missed = new char[6];
            int incorrectGuesses = 0;
            int nextIndex = 0;
            option = ' '; //reset option

            // generate random word and place holders
            String answer = randomWord(words);
            char[] placeHolders = new char[answer.length()];
            for (int i = 0; i < placeHolders.length; i++) {
                placeHolders[i] = '_';
            }
            ;

            System.out.println(answer + "\n");

            while (incorrectGuesses < 6) {
                System.out.println("\033[H\033[2J"); // clears the screen
                System.out.flush();
                System.out.print("Guesses: ");
                printCharArray(guesses);
                System.out.println("\n");
                System.out.println(gallows[incorrectGuesses]);
                System.out.print("\nWord: ");
                printPlaceHolders(placeHolders);
                System.out.print("Misses: ");
                printCharArray(missed);
                System.out.println("\n");

                System.out.print("Guess: ");
                char guess = scan.nextLine().charAt(0);

                // checks if already guessed letter
                while(checkGuesses(guesses, guess)){
                    System.out.println("You already guessed that.  Please try again.");
                    System.out.print("Guess: ");
                    guess = scan.nextLine().charAt(0);
                }

                // add guess to next empty in guessed array
                guesses[nextIndex] = guess;
                nextIndex++;

                if (checkGuess(answer, guess)) {
                    updatePlaceHolders(answer, placeHolders, guess);
                } else {
                    missed[incorrectGuesses] = guess;
                    incorrectGuesses++;
                }

                if (Arrays.equals(answer.toCharArray(), placeHolders)) {
                    System.out.println("\033[H\033[2J"); // clears the screen
                    System.out.flush();
                    System.out.println(gallows[incorrectGuesses]);
                    System.out.print("\nWord: ");
                    printPlaceHolders(placeHolders);
                    System.out.println("AWESOME!!! You solved it.");
                    solved++;
                    break;
                }

                if (incorrectGuesses == 6) {
                    System.out.println(gallows[gallows.length - 1]);
                    System.out.println("R.I.P.!\n");
                    System.out.println("The correct answer was: " + answer);
                    rip++;
                }

            }

            System.out.print("Would you like to play again? y or n? ");
            option = scan.nextLine().charAt(0);

            if (option == 'n' || option == 'N') {
                isPlay = false;
            }
        }

        System.out.println("\nThank you for playing.");
        System.out.println("Solved: " + solved + " RIP: " + rip);
        scan.close();
    }

    /**
     * Function name: randomWord
     * @param words (String[])
     * @return word (String)
     *
     * Inside the function:
     *  1. generates a random number from 0 to words array length
     *  2. uses generated number as index for words array
     */
    public static String randomWord(String[] words) {
        double index = Math.random() * words.length;
        String word = words[(int) index];
        return word;
    }

    /**
     * Function name: printPlaceholders
     * @param placeHolders (char[])
     *
     * Inside the function:
     *  1. loop through char[] print a space before each element on
     *      same line
     */
    public static void printPlaceHolders(char[] placeHolders) {
        for (int i = 0; i < placeHolders.length; i++) {
            System.out.print(" " + placeHolders[i]);
        };

        System.out.println("\n");
    }

    /**
     * Function name: printArray
     * @param arr (char[])
     * 
     * Inside the function:
     *  1. prints array out by element separated by a space
     */
    public static void printCharArray(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        };
    }

    /**
     * Function name: checkGuess
     * @param word (String)
     * @param guess (char)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. checks guess against every letter in word
     *     to see if it exists
     */
    public static boolean checkGuess(String word, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                return true;
             }
        };

        return false;
    }

    /**
     * Function name: updatePlaceHolders
     * @param word (string)
     * @param placeHolders (char[])
     * @param guess (char)
     * 
     * Inside the function:
     *  1. compares guess against word
     *  2. if match, replaces '_' at same index in placeHolders
     */
    public static void updatePlaceHolders(String word, char[] placeHolders, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                placeHolders[i] = guess;
            }
        };
    }

    /**
     * Function name: checkGuesses
     * @param word (String)
     * @param guess (char)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. checks guess against every letter in char arr
     *     to see if it exists
     */
    public static boolean checkGuesses(char[] arr, char guess) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == guess) {
                return true;
             }
        };

        return false;
    }

}
