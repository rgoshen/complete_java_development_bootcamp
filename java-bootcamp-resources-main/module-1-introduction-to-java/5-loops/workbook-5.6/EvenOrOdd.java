public class EvenOrOdd {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            String evenOrOdd = "";
            if (i % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
             System.out.println(i + " - " + evenOrOdd);
        };
    }
}
