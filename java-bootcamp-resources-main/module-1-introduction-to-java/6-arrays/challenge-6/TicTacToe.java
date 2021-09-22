import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

      System.out.println("\nLet's play tic tac toe");

            char[][] board = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' },
            };

            printBoard(board);

            for (int i = 0; i < 9; i++) {
              int[] spot;
              int count = 0;
              if (i % 2 == 0) {
                System.out.println("Turn: X");
                spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
              } else {
                System.out.println("Turn: O");
                  spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
              }
              printBoard(board);
              count = checkWin(board);
              if (count == 3) {
                System.out.println("X wins!");
                break;
              } else if (count == -3) {
                System.out.println("O wins!");
                break;
              } else if (i == 8) {
                System.out.println("It's a tie!");
              }
            };

            scan.close();
        }


    /**
     * Function name - printBoard()
     * @param board (char[][])
     *
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines.
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */

     public static void printBoard(char[][] board) {
       System.out.print("\n");
       for (int i = 0; i < board.length; i++) {
         System.out.print("\t");
          for (int j = 0; j < board[i].length; j++) {
             System.out.print(board[i][j] + " ");
           };
          System.out.print("\n\n");
       };
     }

   /**
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     *
     * Inside the function
     *   1. Asks the user: • pick a row and column number:
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     *
     */

   public static int[] askUser(char[][] board) {
     System.out.print(" • pick a row and column number: ");
     int row = scan.nextInt();
     int col = scan.nextInt();

     while (board[row][col] != ('_')) {
       System.out.print("• spot is taken. Please try again: ");
       row = scan.nextInt();
       col = scan.nextInt();
     }

     int[] spot = { row, col };

     return spot;
   }

    /**
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */

    public static int checkWin(char[][] board) {
      int counter = 0;

      // check each row
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
           if (board[i][j] == 'X') {
             counter++;
           } else if (board[i][j] == 'O') {
             counter--;
           }
          };
         
          
        };
        
        if (counter == 3 || counter == -3) {
            return counter;
          } else {
            counter = 0;
          }
        
      // check each column
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
           if (board[j][i] == 'X') {
             counter++;
           } else if (board[j][i] == 'O') {
             counter--;
            }
          };
         
          if (counter == 3 || counter == -3) {
            return counter;
          } else {
            counter = 0;
          }
        };

        // right-down diagonal
        for (int i = 0; i < board.length; i++) {
           if (board[i][i] == 'X') {
             counter++;
           } else if (board[i][i] == 'O') {
             counter--;
           }
         };

         if (counter == 3 || counter == -3) {
           return counter;
         } else {
           counter = 0;
         }
           
         // left-down diagonal
         for (int i = 0; i < board.length; i++) {
           if (board[i][2 - i] == 'X') {
             counter++;
           } else if (board[i][i] == 'O') {
             counter--;
           }
         };

      return counter;
    }

}

