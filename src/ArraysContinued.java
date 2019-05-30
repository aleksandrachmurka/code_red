import java.util.Arrays;
import java.util.Random;

public class ArraysContinued {

    public static void main(String[] args) {
        Random random = new Random(1);
        int counter = 0;
        int[] numbers = new int[10];

        while(counter < 9) {
            int r = random.nextInt(10);
            numbers[counter] = r;
            counter++;
        }

        int [] numbersCopy = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[numbers.length-i-1];
        }

        for( int number : numbers) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbersCopy));

    }

}
