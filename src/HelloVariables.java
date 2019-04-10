public class HelloVariables {
    public static void main(String[] args) {
        String firstLine;
        firstLine = "Hello, again!";
        System.out.println(firstLine);

        int hour, minute;
        hour = 11; minute= 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        int seconds = 59;
        System.out.println(seconds/60);

        double secs = 59.0;
        System.out.println(secs/60.0);
    }
}
