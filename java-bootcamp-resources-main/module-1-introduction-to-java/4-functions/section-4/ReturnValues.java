public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(2.2, 4.3, "area");
        double measure2 = measureRectangle(3.2, 4.1, "perimeter");
        double measure3 = measureRectangle(-2.0, 4.3, "area");

        stringPrinter(2.2, 4.3, measure1, "area");
        stringPrinter(3.2, 4.1, measure2, "perimeter");
        stringPrinter(-2.0, 4.3, measure3, "area");
    }

    public static double measureRectangle(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("length/width can not be negative!");
            System.exit(0);
        }
        
        switch (option.toLowerCase()) {
            case "area":
                return length * width;
            case "perimeter":
                return 2 * (length + width);
            default:
                return 0.0;
        }
    }

    public static void stringPrinter(double length, double width, double measurement, String option) {
        System.out.println("The " + option + " of a rectangle with a width of " + width 
        + " and a length of " + length + " is equal to " + measurement + "\n");
    }
}
