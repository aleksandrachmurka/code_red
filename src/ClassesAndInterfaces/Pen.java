package ClassesAndInterfaces;

public class Pen implements Item {
    private double price;

    public Pen(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price of pen:" + price;
    }
}
