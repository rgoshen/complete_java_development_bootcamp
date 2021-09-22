public class Bus {
    public static void main(String[] args) {
        int passengers = 0;
        String sentence = "Number of passengers: ";
        passengers = passengers + 9;
        System.out.println(sentence + passengers);
        passengers = passengers - 5;
        System.out.println(sentence + passengers);
        passengers = passengers - 4;
        System.out.println(sentence + passengers);

        sentence = "End of shift!!!";
        System.out.println(sentence);
    }
}