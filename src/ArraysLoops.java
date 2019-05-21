import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysLoops {

    char[] fruit = new char[] {'b', 'a', 'n', 'a', 'n', 'a'};

    public static void whileLoop() {

        String banana = "banana";
        int length = banana.length();
        int index = 0;
        int count = 0;

        while (index < length) {
            if(banana.charAt(index) == 'a') {
                count++;
            }
            index++;
        }

        System.out.println(count);
    }

    public static void doWhileLoop() {
        String banana = "banana";
        int length = banana.length();
        int index = 0;
        int count = 0;

        do {
            if(banana.charAt(index) == 'a') {
                count++;
            }
            index++;
        } while (index < length-1);

        System.out.println(count);

    }

    public static void forLoop() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            if (i % 2 == 0) {
                System.out.println("Number " + i + " is even");
            } else {
                System.out.println("Number " + i + " is odd");
            }
        }
    }

    public static void forEach() {
        int[] numbers = new int[] {0,1,2,3,4,5,6,7,8,9};

        for(int number : numbers) {
            System.out.println(number);
        }

        Arrays.sort(numbers);
    }

    public static void printReverse()  {
        String[] fruits = new String[] {"banana", "apple", "mango"};
        int i = fruits.length -1;
        while(i >= 0) {
            System.out.println(fruits[i]);
            i--;
        }

    }

    public static void inputLoop() {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[10];
        int counter = 0;

        while(counter < inputNumbers.length) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (number == 5) continue;
            inputNumbers[counter] = number;
            counter++;
        }

        for(int num: inputNumbers) {
            System.out.println(num);
        }
    }



    public static void main(String[] args) throws InterruptedException {

        whileLoop();
        doWhileLoop();
        forLoop();
        forEach();
        printReverse();
        inputLoop();


        Integer a = 10;
        Integer b = 20;
        //returns int 1- bigger than, 0 - equal, 1- smaller
        System.out.println(a.compareTo(b));

        //List, we cannot use int - Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.set(0, 5);
        numbers.get(0);
        Collections.sort(numbers);
        System.out.println(numbers);

        //Array
        int[] nums = new int[10];
        nums[2] = 1;
        System.out.println(Arrays.toString(nums));
    }
}
