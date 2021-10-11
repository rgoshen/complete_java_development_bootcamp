package src.main.models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

    /**
     * Function name: add
     * @param item 
     * @return (boolean) <-------
     * 
     * Inside the function:
     *   1. adds an Item object
     *   2. returns true <-------
     */
    public boolean add(Item item) {
        if (this.items.contains(item)) {
            return false;
        }

        this.items.add(new Item(item));
        return true;
    }

    /**
    * Function name: remove
    * @param name
    * 
    * Inside the function:
    *   1. loop runs through the size of the ArrayList.
    *   2. removes the item that matches the name passed in. 
    */
    public void remove(String name) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("INVALID STATE");
        }
        this.items.removeIf((item) -> item.getName().equals(name));
    }
  
    /**
    * Function name: getSubtotal
    * @return double
    * 
    * Inside the function:
    *   1. loop runs through the size of the ArrayList.
    *   2. adds the price field of each Item object. 
    *   3. returns the sum
    */
    public double getSubtotal() {
        return this.items.stream().mapToDouble((item) -> item.getPrice()).sum();
    }
  
    /**
    * Function name: getTax
    * @param double (subtotal)
    * @return double
    * 
    * Inside the function:
    *   1. calculates tax
    *   2. rounds to two decimal places
    *   3. returns the result
    */
    public double getTax(double subtotal) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(subtotal * 0.13));
    }
  
    /**
    * Function name: getTotal
    * @param double (subtotal)
    * @param double (tax)
    * @return (double)
    * 
    * Inside the function:
    *   1. returns subtotal + tax
    */
    public double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("IVALID STATE");
        }
        return "\tRECEIPT\n\n" +
            "\tSubtotal: $" + getSubtotal() + "\n" +
            "\tTax: $" + getTax(getSubtotal()) + "\n" +
            "\tTotal: $" + getTotal(getSubtotal(), getTax(getSubtotal())) + "\n";
    }

    /**
     * Function name: contains
    * @param item
    * @return (boolean)
    * 
    * Inside the function:
    *    1. checks if items list contains() item.
    */
    public boolean contains(Item item) {
        return this.items.contains(item);
    }

    public void clear() {
        this.items.clear();
    }

}
