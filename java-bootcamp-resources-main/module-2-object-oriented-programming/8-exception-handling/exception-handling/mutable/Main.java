public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable or Immutable? - mutable, possible to update car

        System.out.println(car.getMake());
        car.setMake("Honda");
        System.out.println(car.getMake());

        Car car2 = car; // reference trap
        System.out.println("car: " + car);
        System.out.println("car2: " + car2);
        car2.setMake("Honda");
        car2.setPrice(8000);
        System.out.println("car: " + car);
        System.out.println("car2: " + car2);
    }
}
