package models;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items;
    
    public Cart() {
       this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
       return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
       this.items.set(index, new Item(item));
    }

    /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */
    public boolean add(Item item) {
       if (this.items.contains(item)) {
          return false;
       }

       this.items.add(new Item(item));

       return true;
    }
    
    /**
     * Name: isEmpty
     * @return (boolean)
     * 
     * Inside the function:
     *   1. Checks if cart is empty, if yes returns true else false
     */
    public boolean isEmpty() {
       return this.items.isEmpty();
    }

    /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */
    public void remove(String name) {
       if (this.items.isEmpty()) {
          throw new IllegalStateException("cannot remove items from an empty cart");
       }

       for (int i = 0; i < this.items.size(); i++) {
          if (this.items.get(i).getName().equals(name)) {
             this.items.remove(i);
          }
       }
    }

    /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    *
    *
    * Receipt:
    *  "\tRECEIPT\n\n" +
        "\tSubtotal: $" + <subtotal> + "\n" +
        "\tTax: $" + <tax> + "\n" +
        "\tTotal: $" + <total> + "\n";
     */
    public String checkout() {
       double[] receipt = new double[3];

       if (this.items.isEmpty()) {
          throw new IllegalStateException("cannot checkout an empty cart");
       }

       for (int i = 0; i < this.items.size(); i++) {
          receipt[0] += this.items.get(i).getPrice();
       }

       receipt[1] = receipt[0] * 0.13;
       receipt[2] = receipt[0] + receipt[1];

       return "\tRECEIPT\n\n" +
             "\tSubtotal: " + receipt[0] + "\n" +
             "\tTax: " + receipt[1] + "\n" +
             "\tTotal: " + receipt[2] + "\n";
    }

    /**
     * - Set a String temp = ""
     * - Loop through every item in the items field
     * - During each run, add the toString of each item
     * - During each run, add one line \n to temp
     * - return temp;
     */
    public String toString() {
       String temp = "";
       for (int i = 0; i < this.items.size(); i++) {
          temp += this.items.get(i).toString();
          temp += "\n";
       }

       return temp;
    }
}
