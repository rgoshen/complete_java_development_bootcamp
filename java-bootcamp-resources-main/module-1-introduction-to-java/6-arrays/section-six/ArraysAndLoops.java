public class ArraysAndLoops {
    public static void main(String[] args) {
        String[] kingdoms = { "Mercia", "Wessex", "Northumbria", "E. Anglia" };

        System.out.println("The number of elements for kingdoms is " + kingdoms.length + "\n");

        // for (int i = 0; i < 4; i++) {
        for (int i = 0; i < kingdoms.length; i++) {
             System.out.println(i + ". " + kingdoms[i]);
        };
    }
}
