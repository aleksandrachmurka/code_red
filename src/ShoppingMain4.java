import java.util.Arrays;
import java.util.Scanner;

public class ShoppingMain4 {
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);

        System.out.println("Please enter number of items : ");
        int numberOfItems = input.nextInt();

        String[] item_names = new String[numberOfItems];
        int[] item_prices = new int[numberOfItems];
        int[] item_quantities = new int[numberOfItems];
        double[] item_coupons = new double[numberOfItems];
        double[] item_finalCosts = new double[numberOfItems];

        double finalCost = 0;


        for(int i = 0; i < numberOfItems; i++){
            int itemCount = i + 1;
            System.out.println("Item number : " + itemCount);

            String item_name;
            System.out.println("Enter name of item" + itemCount + " : ");
            item_name = input.next();
            if(item_name.length() > 10){
                System.out.println("Item name cannot be more than 10 characters !");
                return;
            }
            item_names[i] = item_name;

            int item_price;
            System.out.println("Enter price of item" + itemCount + " : ");
            item_price = input.nextInt();
            item_prices[i] = item_price;

            int item_quantity;
            System.out.println("Enter quantity of item" + itemCount + " : ");
            item_quantity = input.nextInt();
            item_quantities[i] = item_quantity;

            double item_coupon;
            System.out.println("Enter coupon for item" + itemCount + " : ");
            item_coupon = input.nextDouble();
            item_coupons[i] = item_coupon;


            int item_totalCost = calculateTotalCost(item_price, item_quantity);

            printTotalCost(item_name, item_totalCost);
            printCouponRate(item_name, item_coupon);
            double item_finalCost = calculateFinalCost(item_totalCost, item_coupon);
            item_finalCosts[i] = item_finalCost;

            printFinalCost(item_name, item_finalCost);

            finalCost = finalCost + item_finalCost;
        }


        System.out.printf("Final cost of all items : %.2f", finalCost);
        System.out.println();
        System.out.println("Enter coupon code : ");
        String couponCode = input.next();

        double couponDiscount = calculateCouponDiscount(couponCode, finalCost);
        double costAfterCoupon = finalCost - couponDiscount;

        System.out.printf("Cost after apply coupon on shopping cart : %.2f", costAfterCoupon);

        printCostStatistics(item_finalCosts);
        printCouponStatistics(item_coupons);
    }

    private static void printTotalCost(String itemName, int totalCost) {
        System.out.println("Total cost of " + itemName + " is " + totalCost);
    }

    private static void printCouponRate(String itemName, double coupon) {
        System.out.println("Coupon rate of " + itemName + " is " + coupon);
    }

    private static void printFinalCost(String itemName, double finalCost) {
        System.out.printf("Final cost of " + itemName + " is %.2f", finalCost);
    }

    private static void printCostStatistics(double[] item_finalCosts) {
        double highestCost = 0;
        double lowestCost = Integer.MAX_VALUE;
        for (double finalCost : item_finalCosts) {
            if (finalCost > highestCost) {
                highestCost = finalCost;
            }

            if (finalCost < lowestCost) {
                lowestCost = finalCost;
            }
        }
        System.out.println("****** Cost statistics ******");
        System.out.printf("Most expensive item costs : %.2f",  highestCost);
        System.out.printf("Cheapest item costs : %.2f", lowestCost);
    }
//
    private static void printCouponStatistics(double[] item_coupons) {
        double highestCoupon =0;
        for (double coupon : item_coupons) {
            highestCoupon = coupon;

            if (coupon > highestCoupon ) {
                highestCoupon = coupon;
            }

        }
        System.out.println("****** Coupon statistics ******");
        System.out.println(highestCoupon + " percent off is awesome !!");
    }

    private static int calculateTotalCost(int price, int quantity){
        int totalCost = price * quantity;
        return totalCost;
    }

    private static double calculateFinalCost(int totalCost, double coupon){
        double finalCost = totalCost - (totalCost * coupon / 100);
        return finalCost;
    }

    private static double calculateCouponDiscount(String couponCode, double finalCost){
        double couponDiscount = 0;
        if (couponCode.equals("A")) {
            couponDiscount = finalCost * 5 / 100;
        } else if (couponCode.equals("B")) {
            couponDiscount = finalCost * 10 / 100;
        } else if (couponCode.equals("C")) {
            couponDiscount = finalCost * 20 / 100;
        }

        return couponDiscount;
    }
}