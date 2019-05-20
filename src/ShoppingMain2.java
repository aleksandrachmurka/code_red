import java.util.Scanner;

/**
 * Session 5: Make following changes in code of week4
 *

 *
 * 7. Prompt user to enter details of item3 i.e. item_3_name, item_3_price, item_3_quantity, item_3_coupon and recalculate 2, 3, 4, 5, 6 above.
 *
 **/
public class ShoppingMain2 {
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);

        String item_1_name;
        System.out.println("Enter name of item1 : ");
        item_1_name = input.next();

        String item_2_name;
        System.out.println("Enter name of item2 : ");
        item_2_name = input.next();

        String item_3_name;
        System.out.println("Enter name of item3 : ");
        item_3_name = input.next();

        int item_1_price;
        System.out.println("Enter price of item1 : ");
        item_1_price = input.nextInt();

        int item_2_price;
        System.out.println("Enter price of item2 : ");
        item_2_price = input.nextInt();

        int item_3_price;
        System.out.println("Enter price of item3 : ");
        item_3_price = input.nextInt();

        int item_1_quantity;
        System.out.println("Enter quantity of item1 : ");
        item_1_quantity = input.nextInt();

        int item_2_quantity;
        System.out.println("Enter quantity of item2 : ");
        item_2_quantity = input.nextInt();

        int item_3_quantity;
        System.out.println("Enter quantity of item3 : ");
        item_3_quantity = input.nextInt();

        double item_1_totalCost = item_1_price * item_1_quantity;
        double item_2_totalCost = item_2_price * item_2_quantity;
        double item_3_totalCost = item_3_price * item_3_quantity;

        printTotalCost(item_1_name, item_1_totalCost);
        printTotalCost(item_2_name, item_2_totalCost);
        printTotalCost(item_3_name, item_3_totalCost);

        int item_1_coupon;
        System.out.println("Enter coupon for item1 : ");
        item_1_coupon = input.nextInt();

        int item_2_coupon;
        System.out.println("Enter coupon for item2 : ");
        item_2_coupon = input.nextInt();

        int item_3_coupon;
        System.out.println("Enter coupon for item3 : ");
        item_3_coupon = input.nextInt();

        printCouponRate(item_1_name, item_1_coupon);
        printCouponRate(item_2_name, item_2_coupon);
        printCouponRate(item_3_name, item_3_coupon);

        double item_1_finalCost = item_1_totalCost
                - (item_1_totalCost * item_1_coupon / 100);
        double item_2_finalCost = item_2_totalCost
                - (item_2_totalCost * item_2_coupon / 100);
        double item_3_finalCost = item_3_totalCost
                - (item_3_totalCost * item_3_coupon / 100);

        printFinalCost(item_1_name, item_1_finalCost);
        printFinalCost(item_2_name, item_2_finalCost);
        printFinalCost(item_3_name, item_3_finalCost);

        printCostStatistics(item_1_finalCost, item_2_finalCost, item_3_finalCost);
        printCouponStatistics(item_1_coupon, item_2_coupon, item_3_coupon);

        printMostExpensiveItem(item_1_finalCost, item_2_finalCost, item_3_finalCost,
                item_1_name, item_2_name, item_3_name);
        printLeastExpensiveItem(item_1_finalCost, item_2_finalCost, item_3_finalCost,
                item_1_name, item_2_name, item_3_name);

        double finalCostAll = item_1_finalCost + item_2_finalCost + item_3_finalCost;
        printFinalCostAll(finalCostAll);

        String cartCoupon;
        System.out.println("Enter coupon for your shopping cart : ");
        cartCoupon = input.next();

        printFinalCartCost(cartCoupon, finalCostAll);
    }

    private static void printTotalCost(String itemName, double totalCost) {
        System.out.println("Total cost of " + itemName + " is " + totalCost);
    }

    private static void printCouponRate(String itemName, int coupon) {
        System.out.println("Coupon rate of " + itemName + " is " + coupon);
    }

    private static void printFinalCost(String itemName, double finalCost)
    {
        System.out.println("Final cost of " + itemName + " is " + finalCost);
    }

    private static void printCostStatistics(double finalCost1, double finalCost2, double finalCost3){
        System.out.println("****** Cost statistics ******");
        System.out.println("Most expensive item costs : " + Math.max(Math.max(finalCost1, finalCost2), finalCost3));
        System.out.println("Cheapest item costs : " + Math.min(Math.min(finalCost1, finalCost2), finalCost3));
    }

    private static void printCouponStatistics(double coupon1, double coupon2, double coupon3){
        System.out.println("****** Coupon statistics ******");
        System.out.println(Math.max(Math.max(coupon1, coupon2), coupon3) +  " percent off is awesome !!");
    }

    private static void printMostExpensiveItem(double item_1_finalCost, double item_2_finalCost, double item_3_finalCost,
                                               String item_1_name, String item_2_name, String item_3_name){
        double mostExpensive = Math.max(Math.max(item_1_finalCost, item_2_finalCost), item_3_finalCost);
        if (mostExpensive == item_1_finalCost) {
            System.out.println(item_1_name + " is the most expensive");
        } else if (mostExpensive == item_2_finalCost) {
            System.out.println(item_2_name + " is the most expensive");
        } else {
            System.out.println(item_3_name + " is the most expensive");
        }
    }

    private static void printLeastExpensiveItem(double item_1_finalCost, double item_2_finalCost,double item_3_finalCost,
                                                String item_1_name, String item_2_name, String item_3_name){
        double leastExpensive = Math.min(Math.min(item_1_finalCost, item_2_finalCost), item_3_finalCost);
        if (leastExpensive == item_1_finalCost) {
            System.out.println(item_1_name + " is the least expensive");
        } else if (leastExpensive == item_2_finalCost) {
            System.out.println(item_2_name + " is the least expensive");
        } else {
            System.out.println(item_3_name + " is the least expensive");
        }
    }

    private static void printFinalCostAll(double finalCostAll) {
        System.out.println("Total cost for all items is " + finalCostAll);
    }

    private static void printFinalCartCost(String cartCoupon, double finalCostAll) {
        switch (cartCoupon) {
            case "A":
                System.out.println("TOTAL: " + (finalCostAll - finalCostAll * 5 / 100));
                break;
            case "B":
                System.out.println("TOTAL: " + (finalCostAll - finalCostAll * 10 / 100));
                break;
            case "C":
                System.out.println("TOTAL: " + (finalCostAll - finalCostAll * 20 / 100));
                break;
            default:
                System.out.println("Invalid coupon.");
                break;
        }

    }
}