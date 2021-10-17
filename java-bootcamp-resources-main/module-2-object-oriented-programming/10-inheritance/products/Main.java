import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

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

        // Product[] products = new Product[] {
        //     new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
        //     new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
        //     new Pants(34, 104.99, "Red", "JANGLER"),
        //     new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
        //     new Pants(30, 119.99, "Grey", "FENDI"),
        //     new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
        //     new Pants(30, 129.99, "Red", "VERSACE"),
        //     new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
        //     new Pants(29, 99.99, "Dark", "JANGLER"),
        //     new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
        //     new Pants(26, 24.99, "Indigo", "BELSTAFF"),
        //     new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
        //     new Pants(34, 104.99, "Red", "JANGLER"),
        // };
        // Product[] products = new Product[] {
        //     new Pants(32, 24.59, "Blue", "JAVA KLEIN"),
        //     new Shirt(Shirt.Size.MEDIUM, 24.29, "Black", "CHANEL"),
        //     new Pants(34, 24.53, "Red", "JANGLER"),
        //     new Shirt(Shirt.Size.SMALL, 24.89, "Orange", "GEORGE"),
        //     new Pants(30, 24.54, "Grey", "FENDI"),
        //     new Shirt(Shirt.Size.LARGE, 24.49, "Blue", "ECKO"),
        //     new Pants(30, 24.51, "Red", "VERSACE"),
        //     new Shirt(Shirt.Size.SMALL, 24.49, "Beige", "ZARA"),
        //     new Pants(29, 24.53, "Dark", "JANGLER"),
        //     new Shirt(Shirt.Size.SMALL, 24.79, "Red", "NIKE"),
        //     new Pants(26, 24.58, "Indigo", "BELSTAFF"),
        //     new Shirt(Shirt.Size.LARGE, 24.54, "Blue", "ADIDAS"),
        //     new Pants(34, 24.50, "Red", "JANGLER"),
        // };

        // printArray(products);
        // Arrays.sort(products);
        // System.out.println("Sorted:");
        // printArray(products);

        try {
            Product[] products = getData();
            Arrays.stream(products)
            .sorted()
            .forEach(item -> System.out.println(item));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

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
    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scan = new Scanner(fis);

        Product[] products = new Product[18];

        for (int i = 0; scan.hasNextLine(); i++) {
            switch (scan.next()) {
                case "PANTS":
                    products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next());
                    break;
                case "SHIRT":
                    products[i] = new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(),
                            scan.next());
                    break;
            }
        }
        scan.close();
        return products;
    }
}
