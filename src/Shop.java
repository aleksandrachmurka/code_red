public class Shop {

    public static double total_cost (double item_price, int item_quantity) {
        return item_price * item_quantity;
    }

    public static double final_cost (double total_cost, double item_coupon) {
        return total_cost - (total_cost * item_coupon);
    }

    public static void main(String[] args) {

        String item_1_name = "coat";
        String item_2_name = "bag";

        double item_1_price = 50.0;
        double item_2_price = 30.0;

        int item_1_quantity = 2;
        int item_2_quantity = 3;

        double item_1_coupon = 0.1;
        double item_2_coupon = 0.15;

        double total_cost_1 = total_cost(item_1_price, item_1_quantity);
        double total_cost_2 = total_cost(item_2_price, item_2_quantity);

        double final_cost_1 = final_cost(total_cost_1, item_1_coupon);
        double final_cost_2 = final_cost(total_cost_2, item_2_coupon);

        System.out.println("You have bought: " + (item_1_quantity + item_2_quantity) + " items");
        System.out.println("Very cool " + item_1_name + " and most trendy " + item_2_name);
        System.out.println("Normally, we would charge you: " + (total_cost_1 + total_cost_2));
        System.out.print("But we have some nice discounts for you, so total is: " + (final_cost_1 + final_cost_2));
    }

}
