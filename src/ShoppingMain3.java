import java.util.Scanner;
public class ShoppingMain3 {

    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);

        double finalCost = 0;
        int numberOfItems;
        int counter = 0;
        System.out.println("How many items you would like to buy? Enter a number");
        numberOfItems = input.nextInt();

        while (counter < numberOfItems) {
            System.out.println("Enter name of item : ");
            String item_name = input.next();
            if (item_name.length() > 10) {
                System.out.println("Name of this item is too long");
                return;
            }

            System.out.println("Enter price of item : ");
            int item_price = input.nextInt();

            System.out.println("Enter quantity of item : ");
            int item_quantity = input.nextInt();

            System.out.println("Enter coupon for item : ");
            double item_coupon = input.nextDouble();

            double totalCost = calculateTotalCost(item_price, item_quantity, item_coupon);
            System.out.println("Total cost of " + item_name + " is " + totalCost);

            finalCost += totalCost;
            System.out.println("Final cost for your shopping is " + finalCost);

            counter++;
        }

        System.out.println("Enter discount coupon: ");
        String couponCode = input.next();
        double finalCostAfterDiscount = calculateFinalCost(couponCode, finalCost);

        System.out.printf("Final cost after discount is %.2f", finalCostAfterDiscount);

    }

    private static double calculateTotalCost (int price, int quantity, double coupon){
        int cost = price * quantity;
        double totalCost = cost - (cost * coupon / 100);
        return totalCost;
    }

    private static double calculateFinalCost(String cartCoupon, double finalCost) {
        switch (cartCoupon) {
            case "A":
                finalCost = finalCost - finalCost * 5 / 100;
                break;
            case "B":
                finalCost = finalCost - finalCost * 10 / 100;
                break;
            case "C":
                finalCost = finalCost - finalCost * 20 / 100;
                break;
            default:
                System.out.println("Invalid coupon.");
                break;
        }

        return finalCost;
    }
}

