package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationShopping {
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);

        System.out.println("Please enter number of items : ");
        int numberOfItems = input.nextInt();
        ArrayList<Item> items = new ArrayList<>();
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

            int item_price;
            System.out.println("Enter price of item" + itemCount + " : ");
            item_price = input.nextInt();

            int item_quantity;
            System.out.println("Enter quantity of item" + itemCount + " : ");
            item_quantity = input.nextInt();


            double item_coupon;
            System.out.println("Enter coupon for item" + itemCount + " : ");
            item_coupon = input.nextDouble();

            Item item = new Item(item_name, item_price, item_quantity, item_coupon);
            int item_totalCost = item.calculateTotalCost();
            double item_finalCost = item.calculateFinalCost();


            items.add(item);
            finalCost = finalCost + item_finalCost;

            printTotalCost(item_name, item_totalCost);
            printCouponRate(item_name, item_coupon);
            printFinalCost(item_name, item_finalCost);
            System.out.println("Added item: " + item.toString());

        }

        System.out.printf("Final cost of all items : %.2f", finalCost);
        System.out.println();
        System.out.println("Enter coupon code : ");
        String couponCode = input.next();

        double couponDiscount = calculateCouponDiscount(couponCode, finalCost);
        double costAfterCoupon = finalCost - couponDiscount;

        System.out.printf("Cost after apply coupon on shopping cart : %.2f", costAfterCoupon);

        printCostStatistics(items);
        printCouponStatistics(items);
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

    private static void printCostStatistics(ArrayList<Item> items) {
        double highestCost = 0;
        double lowestCost = Integer.MAX_VALUE;
        for (Item item : items) {
            double totalCost = item.calculateTotalCost();
            double itemFinalCost = item.calculateFinalCost();
            if ( itemFinalCost > highestCost) {
                highestCost = itemFinalCost;
            }

            if (itemFinalCost < lowestCost) {
                lowestCost = itemFinalCost;
            }
        }
        System.out.println("****** Cost statistics ******");
        System.out.printf("Most expensive item costs : %.2f",  highestCost);
        System.out.printf("Cheapest item costs : %.2f", lowestCost);
    }

    private static void printCouponStatistics(ArrayList<Item> items) {
        double highestCoupon =0;
        for (Item item : items) {
            double itemCoupon = item.getCoupon();

            if (itemCoupon > highestCoupon ) {
                highestCoupon = itemCoupon;
            }

        }
        System.out.println("****** Coupon statistics ******");
        System.out.println(highestCoupon + " percent off is awesome !!");
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
