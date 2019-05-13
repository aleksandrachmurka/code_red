public class Methods {

    public static void printArgument(String str) {
        System.out.println(str);
    }

    public static void printHour(int hour, int minutes) {
        System.out.println("" + hour + ":" + minutes);
    }

    public static void howManyMinutes(int h, int min) {
        int minutes = (h *60) + min;
        System.out.println(minutes);
    }

    public static void main(String[] args) {
        String argument = "Hello";
        printArgument(argument);

        int hour = 15;
        int minutes = 49;
        printHour(hour, minutes);

        howManyMinutes(2, 15);
    }

}
