import java.util.Scanner;

public class Conditionals {

    public static String isAdult (int age) {
        if (age < 18) {
            return "You are under 18";
        } else {
            return "You are an adult";
        }
    }
    public static void main(String[] args) {
        System.out.println("How old are you?");
        final Scanner scanner = new Scanner(System.in);
        final int age = scanner.nextInt();
        System.out.println(isAdult(age));

    }
}
