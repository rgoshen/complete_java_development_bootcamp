import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String[] parts = { "tire", "keys" };

        Car[] cars = new Car[]{
            new Car("Nissan", 15999, 2021, "red", new String[] {"tire", "keys"}),
            new Car("Dodge", 24999, 2021, "orange", new String[] {"tire", "keys"}),
            new Car("Nissan", 8999, 2017, "yellow", new String[] {"tire", "keys", "oil filter"}),
            new Car("Honda", 6999, 2015, "green", new String[] {"tire", "keys", "oil filter"}),
            new Car("Mercedes", 38999, 2018, "silver", new String[] {"tire", "keys", "oil filter", "air filter"}),
        };
        // Car nissan = new Car("Nissan", 15999, 2021, "red", parts);
        // Car nissan2 = nissan;   //reference trap
        // Car dodge = new Car("Charger", 24999, 2021, "orange", parts);
        // Car nissan2 = new Car("Nissan", 15999, 2021, "red");
        // better way to copy class obj
        // Car nissan2 = new Car(nissan);
        // Car nissan = new Car("red");    // will not compile

        // nissan2.setColor("yellow");
        // nissan2.setPrice(14999);
        // nissan2.setYear(2020);
        // nissan2.setParts(new String[] {"tire", "keys", "oil filter"});

        // nissan.setPrice(nissan.getPrice() / 2);
        // dodge.setPrice(dodge.getPrice() / 2);

        // System.out.println("This " + nissan.getColor() + " " + nissan.getYear() + " " + nissan.getMake() + " cost is $" + nissan.getPrice() + ".\n");

        // System.out.println("This " + dodge.getColor() + " " + dodge.getYear() + " " + dodge.getMake() + " cost is $" + dodge.getPrice() + ".\n");

        // System.out.println("This " + nissan2.getColor() + " " + nissan2.getYear() + " " + nissan2.getMake() + " cost is $" + nissan2.getPrice() + ".\n");

        // System.out.println("nissan1 parts: " + Arrays.toString(nissan.getParts()) + "\n");
        // System.out.println("nissan2 parts: " + Arrays.toString(nissan2.getParts()) + "\n");

        // nissan.drive();
        // dodge.drive();
        // nissan2.drive();

        // System.out.println(nissan);
        // System.out.println(dodge);
        // System.out.println(nissan2);

        Dealership dealership = new Dealership(cars);
        // dealership.setCar(nissan, 0);
        // dealership.setCar(dodge, 1);
        // dealership.setCar(nissan2, 2);
        // for (int i = 0; i < cars.length; i++) {
            // dealership.setCar(cars[i], i);
            // System.out.println(dealership.getCar(i));
        // }

        // Car newCar = dealership.getCar(0);
        // System.out.println(newCar);
        // newCar.setColor("green");
        // System.out.println(dealership.getCar(0));
        // System.out.println(newCar);
        // dealership.setCar(newCar, 3);

        // dealership.sell(0);

        // System.out.println(dealership.search("Nissan", 10000));
        System.out.println(dealership);

    }
}
