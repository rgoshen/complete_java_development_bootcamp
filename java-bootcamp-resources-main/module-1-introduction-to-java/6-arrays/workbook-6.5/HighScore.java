public class HighScore {
    public static void main(String[] args) {

        int[] highscores = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };

        System.out.println("Here are the high scores:");
        for (int i = 0; i < highscores.length; i++) {
             System.out.print(highscores[i] + " ");
        };

        int highScore = 0;

        for (int i = 0; i < highscores.length; i++) {
            if (highscores[i] > highScore) {
                highScore = highscores[i];
             }
         }
         ;
        
         System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");


    }
    /** Task 1
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    
    public static int randomNumber() {
        double num = Math.random() * 50000 + 1;

        return (int) num;
    }

}
