public class TypeConversion {
    public static void main(String[] args) {
        double decimal = 4.3;
        int integer = (int) decimal;

        System.out.println(integer);

        double salary = 5833.3333333;
        int roundedSalary = (int) salary;
        System.out.println("Your monthly salary is: $" + roundedSalary);
    }
}
