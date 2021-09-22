import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        // Reference Trap
        // String[] staffLastYear = { "Tom", "Dick", "Harry" };
        // String[] staffThisYear = staffLastYear;
        // System.out.println("Dick quit and Abbie was hired.");
        // staffThisYear[1] = "Abbie";
        // System.out.println("Staff last year: " + Arrays.toString(staffLastYear));
        // System.out.println("Staff this year: " + Arrays.toString(staffThisYear));

        // Proper way to handle #1
        // String[] staffLastYear = { "Tom", "Dick", "Harry" };
        // String[] staffThisYear = new String[staffLastYear.length];

        // for (int i = 0; i < staffLastYear.length; i++) {
        //     staffThisYear[i] = staffLastYear[i];
        // };
        
        // System.out.println("Staff last year: " + Arrays.toString(staffLastYear));
        // System.out.println("Staff this year: " + Arrays.toString(staffThisYear));

        // System.out.println("Dick quit and Abbie was hired.");
        // staffThisYear[1] = "Abbie";
        // System.out.println("Staff last year: " + Arrays.toString(staffLastYear));
        // System.out.println("Staff this year: " + Arrays.toString(staffThisYear));

        // Proper way #2
        String[] staffLastYear = { "Tom", "Dick", "Harry" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        System.out.println("Staff last year: " + Arrays.toString(staffLastYear));
        System.out.println("Staff this year: " + Arrays.toString(staffThisYear));

        System.out.println("Dick quit and Abbie was hired.");
        staffThisYear[1] = "Abbie";
        System.out.println("Staff last year: " + Arrays.toString(staffLastYear));
        System.out.println("Staff this year: " + Arrays.toString(staffThisYear));
    }
}
