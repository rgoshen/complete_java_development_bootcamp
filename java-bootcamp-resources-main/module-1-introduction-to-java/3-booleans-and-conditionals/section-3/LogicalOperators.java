public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you did not get the scholarship.");
        }

        int credits = 45;
        double gpa = 2.89;

        if (credits >= 40 && gpa >= 2.00) {
            System.out.println("Congratulations, you are eligible to graduate.");
        } else {
            System.out.println("We're sorry, you are not eligible to graduate.");
        }
    }
}
