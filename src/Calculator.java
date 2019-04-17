import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please type two numbers");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("Sum of these two numbers is " + sum + " and the product: " + product);

    }
}
