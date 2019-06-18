//Czy warto byloby przeniesc metody calculateTotalCost/calculateFinalCost jako niestatyczne metody do klasy Item

package shop;

public class Item {
    private final String name;
    private final int price;
    private final int quantity;
    private final double coupon;

    public Item(String name, int price, int quantity, double coupon) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.coupon = coupon;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCoupon() {
        return coupon;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", coupon=" + coupon +
                '}';
    }

    public int calculateTotalCost(){
        return price * quantity;
    }

    public double calculateFinalCost(){
        return (price * quantity) - ((price * quantity) * coupon / 100);
    }
}
