public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "black");
        Car sameCar = new Car(car);
        Car car2 = new Car("Toyota", "blue");

        System.out.println(car.equals(sameCar));
        System.out.println(car.equals(car2));
    }

}
