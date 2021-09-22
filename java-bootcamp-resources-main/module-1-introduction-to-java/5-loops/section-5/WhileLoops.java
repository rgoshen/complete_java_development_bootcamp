public class WhileLoops {
    public static void main(String[] args) {
        // int num = 25;

        // while (num <=30) {
        //     System.out.println(num);
        //     num++;
        // }
        double choice = 0.01;
        double guess = 0.99;

        while (guess > choice) {
            guess = Math.random();
            System.out.println(guess);
        }
    }
}
