import java.util.Scanner;

public class Shop {

    public static double count_total_cost (double item_price, int item_quantity) {
        return item_price * item_quantity;
    }

    public static double count_final_cost (double total_cost, double item_coupon) {
        return total_cost - (total_cost * item_coupon);
    }

    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);

        System.out.println("What would you like to buy?");
        String item_1_name = input.nextLine();
        double item_1_price;
        switch(item_1_name) {
            case "bag":
                item_1_price = 60;
                break;
            case "sunglasses":
                item_1_price = 45;
                break;
            case "hat":
                item_1_price = 35;
                break;
            default:
                item_1_price = 50;
        }
        System.out.println("It costs " + item_1_price);
        System.out.println("How many?");
        int item_1_quantity = input.nextInt();
        System.out.println("Do you have any coupons? Please enter its value");
        double item_1_coupon = input.nextDouble();

        input.nextLine();

        System.out.println("Anything else?");
        String item_2_name = input.nextLine();
        double item_2_price;
        switch(item_2_name) {
            case "coat":
                item_2_price = 120;
                break;
            case "gloves":
                item_2_price = 25;
                break;
            case "scarf":
                item_2_price = 30;
                break;
            default:
                item_2_price = 45;
        }
        System.out.println("It costs " + item_2_price);
        System.out.println("How many?");
        int item_2_quantity = input.nextInt();
        System.out.println("Discount for a special customer? Please enter its value");
        double item_2_coupon = input.nextDouble();

        double total_cost_1 = count_total_cost(item_1_price, item_1_quantity);
        double total_cost_2 = count_total_cost(item_2_price, item_2_quantity);

        double final_cost_1 = count_final_cost(total_cost_1, item_1_coupon);
        double final_cost_2 = count_final_cost(total_cost_2, item_2_coupon);

        System.out.println("You have bought: " + (item_1_quantity + item_2_quantity) + " items");
        System.out.println("Very cool " + item_1_name + " and most trendy " + item_2_name);
        System.out.println("Normally, we would charge you: " + (total_cost_1 + total_cost_2));
        System.out.println("But we have some nice discounts for you, so total is: " + (final_cost_1 + final_cost_2));
        System.out.println("Goodbye!");
    }

}
