public class Operations {

    public static void main(String[] args) {
        int hours = 3;
        int minutes = 24;

        int seconds = (hours * 60 * 60) + (minutes * 60);

        System.out.print(hours + " hours and "
                + minutes + " minutes is: "
                + seconds + " seconds.");
    }
}
