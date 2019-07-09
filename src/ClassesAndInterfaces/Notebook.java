package ClassesAndInterfaces;

public class Notebook implements Item {
    private double price;
    private String ownersName;
    private int pageCount;

    public Notebook(double price, String ownersName, int pageCount) {
        this.price = price;
        this.ownersName = ownersName;
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Price of notebook: " + price +". Belongs to " + ownersName + ". Has " + pageCount + " pages.";
    }
}