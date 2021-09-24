public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        Car dodge = new Car();

        nissan.make = "Nissan";
        nissan.price = 15999;
        nissan.year = 2021;
        nissan.color = "red";

        dodge.make = "Charger";
        dodge.price = 24999;
        dodge.year = 2021;
        dodge.color = "orange";

        System.out.println("This "+ nissan.color + " " + nissan.year + " " + nissan.make + " cost is $" + nissan.price + ".");
        System.out.println("This "+ dodge.color + " " + dodge.year + " " + dodge.make + " cost is $" + dodge.price + ".");
    }
}
