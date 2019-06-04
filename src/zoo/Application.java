package zoo;

public class Application {

    public static void main(String[] args) {
        Armadillo fryderyk = new Armadillo("Fryderyk", "ants", 10, false);
        Panda tamara = new Panda("Tamara", "bamboo", 20, true );

        fryderyk.getName();
        fryderyk.getWeight();
        tamara.getName();
        tamara.getWeight();

        fryderyk.eat(2);
        fryderyk.getWeight();
        fryderyk.setName("Fryderyk Wielki");
        fryderyk.getName();
        fryderyk.hideAndRun();

        tamara.letOut();
        tamara.climb();
        tamara.eat(1);
        tamara.getWeight();

    }
}
