public class Machine {

    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            };
        }
    }

    public Item getItem(int row, int col) {
        return new Item(this.items[row][col]);
    }

    public void setItem(Item item, int row, int col) {
        this.items[row][col] = new Item(item);
    }

    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense(int row, int col) {
        if (this.items[row][col].getQuantity() > 0) {
            int quantity = this.items[row][col].getQuantity();
            this.items[row][col].setQuantity(quantity - 1);
            return true;
        }

        return false;
    }

    public String toString() {
        String temp = "";

        for (int i = 0; i < this.items.length; i++) {
            temp += "\t";
            for (int j = 0; j < this.items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
            temp += "\n\n";
        }

        temp += "\t************************************************";

        return temp;
    }

}
