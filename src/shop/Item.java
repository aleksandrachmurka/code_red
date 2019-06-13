package shop;

public class Item {
    String name;
    int price;
    int quantity;
    double coupon;
    double finalCost;

    public Item(String name, int price, int quantity, double coupon, double finalCost) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.coupon = coupon;
        this.finalCost = finalCost;
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

    public double getFinalCost() {
        return finalCost;
    }


}
