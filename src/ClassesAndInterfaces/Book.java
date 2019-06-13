package ClassesAndInterfaces;

public class Book implements Item {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price of book: " + price;
    }
}