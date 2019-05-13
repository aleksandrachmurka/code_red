import java.util.Scanner;

public class MathExercises {

    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);

        System.out.println("Please provide a number");
        int number_1 = input.nextInt();
        System.out.println("And another one");
        int number_2 = input.nextInt();
        int largerNumber1 = Math.max(number_1, number_2);
        System.out.println( largerNumber1 + " is the bigger one");

        System.out.println("And one more");
        int number_3 = input.nextInt();
        int largerNumberFinal = Math.max(largerNumber1, number_3);
        System.out.println( largerNumberFinal + " is the biggest one");

    }
}
