package models;

import java.util.Objects;

public class Pants extends Product implements Discountable {
    private int waist;

    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }

    public Pants(Pants source) {
        super(source);
        this.waist = source.waist;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public void discount() {
        super.setPrice(super.getPrice() / 2);
    }

    @Override
    public void fold() {
        System.out.println("Hold pants upright");
        System.out.println("Fold one leg over the other");
        System.out.println("Fold pants from the bottom in thirds");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants) o;
        return waist == pants.waist && super.getBrand() == pants.getBrand() && super.getColor() == pants.getColor()
                && super.getPrice() == pants.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getBrand(), super.getColor(), super.getPrice());
    }

    @Override
    public String toString() {
        return "{" +
            " waist='" + getWaist() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " brand='" + super.getBrand() + "'" +
            "}";
    }

}
