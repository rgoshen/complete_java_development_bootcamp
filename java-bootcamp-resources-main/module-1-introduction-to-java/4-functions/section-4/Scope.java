public class Scope {

    static int dogs  = 15;
    public static void main(String[] args) {
        // int apples = 5;
        someFunction();
        System.out.println(dogs);
    }

    public static void someFunction() {
        // int apples = 10;
        System.out.println(dogs);
    }
}
