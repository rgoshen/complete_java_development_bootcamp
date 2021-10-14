import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2012);
        System.out.println("Nissan: " + nissan.hashCode());
        Car toyota = new Car("Toyota", 2016);
        System.out.println("Toyota: " + toyota.hashCode());
        Car mazda = new Car("Mazda", 2018);
        System.out.println("Mazda: " + mazda.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nissan2: " + nissan2.hashCode());

        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(nissan, 10000.00);
        prices.put(toyota, 15000.00);
        prices.put(mazda, 12500.00);

        // nissan.equals(nissan2);
        System.out.println("Nissan price: " + prices.get(nissan));
        System.out.println("Nissan2 price: " + prices.get(nissan2));

    }
}
