package models;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be blank/null");
        }
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than 0");
        }

        this.name = name;
        this.price = price;
    }

    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be blank/null");
        }

        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than 0");
        }

        this.price = price;
    }

    public String toString() {
        return this.name + ": $" + this.price + " ";
    }

    /**
     * The equals() method must:
     *  - return false if the parameter is null
     *  - return false if the parameter is not an instance of Item
     *  - otherwise type cast parameter to type: Item
     *  - compare every field from both objects
     */
    public boolean equals(Object obj) {
       if (obj == null) {
          return false;
       }
       if (!(obj instanceof Item)) {
          return false;
       }

       Item item = (Item) obj;

       return this.name.equals(item.name) && this.price == item.price;
    }
}