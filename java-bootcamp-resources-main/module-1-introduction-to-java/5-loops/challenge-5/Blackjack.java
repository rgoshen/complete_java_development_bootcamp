import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();

        int playerCardValue1 = drawRandomCard();
        int playerCardValue2 = drawRandomCard();

        System.out.println("\n You get a \n" + cardString(playerCardValue1)
                +  "\n and a \n" + cardString(playerCardValue2));

        int playerHandTotal = Math.min(playerCardValue1, 10) + Math.min(playerCardValue2, 10);

        System.out.println("your total is: " + playerHandTotal);

        int dealerCardValue1 = drawRandomCard();
        int dealerCardValue2 = drawRandomCard();

        System.out.println("The dealer shows \n" + cardString(dealerCardValue1)
                + "\n and has a card facing down \n" + faceDown());

        int dealerHandTotal = Math.min(dealerCardValue1, 10) + Math.min(dealerCardValue2, 10);

        System.out.println("\n dealer's total is hidden");

        String option = hitOrStay();

        while (option.equals("hit")) {
            int newCardValue = drawRandomCard();
            playerHandTotal += Math.min(newCardValue, 10);
            System.out.println("\n You get a \n" + cardString(newCardValue));
            System.out.println("your new total is " + playerHandTotal);
            if (playerHandTotal > 21) {
                System.out.println("Bust! You lose.");
                System.exit(0);
            }
            option = hitOrStay();
        }

        System.out.println("\nDealer's turn");
        System.out.println("The dealer's cards are \n" + cardString(dealerCardValue1)
                + "\n and a \n" + cardString(dealerCardValue2));
                System.out.println("dealer's total is " + dealerHandTotal);

        while (dealerHandTotal < 17) {
            int newCardValue = drawRandomCard();
            dealerHandTotal += Math.min(newCardValue, 10);
            System.out.println("\n Dealer gets a \n" + cardString(newCardValue));
            System.out.println("dealer's new total is " + dealerHandTotal);
            if (dealerHandTotal > 21) {
                System.out.println("Bust! Dealer loses.");
                System.exit(0);
            }
        }

        if (dealerHandTotal > playerHandTotal) {
            System.out.println("Dealer wins!");
        } else if (playerHandTotal > dealerHandTotal) {
            System.out.println("You win!");
        } else {
            System.out.println("Push!");
        }

         scan.close();

    }

    /**
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

     public static int drawRandomCard() {
         double draw = Math.random() * 13 + 1;
         return (int) draw;
     }

    /**
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

     public static String cardString(int cardNum) {
         switch (cardNum) {
            case 1:
                return  "   _____\n"+
                        "  |A _  |\n"+
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
            case 2:
                return  "   _____\n"+
                        "  |2    |\n"+
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
            case 3:
                return  "   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n";
            case 4:
                return  "   _____\n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n";
            case 5:
                return  "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return  "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return  "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return  "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return  "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return  "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return  "   _____\n" +
                        "  |J  ww|\n"+
                        "  | o {)|\n"+
                        "  |o o% |\n"+
                        "  | | % |\n"+
                        "  |__%%[|\n";
            case 12:
                return  "   _____\n" +
                        "  |Q  ww|\n"+
                        "  | o {(|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%O|\n";
            case 13:
                return  "   _____\n" +
                        "  |K  WW|\n"+
                        "  | o {)|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%>|\n";
            default:
                return "";
        }
     }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option
     */
    
    public static String hitOrStay() {
        String response = "";
        System.out.println("\nWould you like to hit or stay?");
        response = scan.nextLine().toLowerCase();

        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("\nPlease type 'hit' or 'stay'.");
            response = scan.nextLine().toLowerCase();
        }

        return response;
    }
    }

