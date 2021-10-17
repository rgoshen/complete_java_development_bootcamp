import java.util.Arrays;

import models.Pants;
import models.Product;
import models.Shirt;
import models.Shirt.Size;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        // Shirt shirt = new Shirt(Shirt.Size.MEDIUM, 5.99, "blue", "Java Vuitton");
        // Pants pants = new Pants(40, 10.99, "blue", "Java Klein");
        // Shirt shirt2 = new Shirt(shirt);
        // Pants pants2 = new Pants(pants);
        // Pants pants3 = new Pants(40, 104.99, "black", "Java Levi");

        // pants2.setPrice(59.99);
        // shirt2.setSize(Size.LARGE);
        // shirt2.setPrice(7.99);
        // System.out.println(shirt.equals(shirt2));
        // System.out.println("Shirt: " + shirt.hashCode());
        // System.out.println("Shirt2: " + shirt2.hashCode());
        // System.out.println(pants.equals(pants2));

        // System.out.println(shirt);
        // System.out.println();
        // System.out.println(shirt2);
        // System.out.println();
        // pants2.discount();
        // System.out.println(pants);
        // System.out.println();
        // System.out.println(pants2);
        // System.out.println();

        // shirt.fold();
        // System.out.println();
        // pants.fold();

        // System.out.println(pants.compareTo(pants3));

        Product[] products = new Product[] {
            new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
            new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
            new Pants(34, 104.99, "Red", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
            new Pants(30, 119.99, "Grey", "FENDI"),
            new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
            new Pants(30, 129.99, "Red", "VERSACE"),
            new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
            new Pants(29, 99.99, "Dark", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
            new Pants(26, 24.99, "Indigo", "BELSTAFF"),
            new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
            new Pants(34, 104.99, "Red", "JANGLER"),
        };

        printArray(products);
        Arrays.sort(products);
        System.out.println("Sorted:");
        printArray(products);

    }
    
    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
