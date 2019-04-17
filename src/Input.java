import java.util.Scanner;

public class Input {

    public static void main (String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        final String name = scanner.nextLine();
        System.out.println("How old are you?");
        final int age = scanner.nextInt();

        int retirementAge = 65;
        int yearsLeft = retirementAge - age;

        String isSoon = "";

        if (yearsLeft > 20) {
            isSoon = "I am so so sorry";
        } else if (yearsLeft < 20 && yearsLeft > 10 ) {
            isSoon = "Come on, it will pass quickly.";
        } else {
            isSoon = "Almost there!";
        }

        System.out.println("Hello " + name + ". You have " + yearsLeft + " left until retirement. " + isSoon);

    }
}
