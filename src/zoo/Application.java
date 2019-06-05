package zoo;

public class Application {

    public static void main(String[] args) {
        Armadillo fryderyk = new Armadillo("Fryderyk", 10, false);
        Panda tamara = new Panda("Tamara", 20, true );

        fryderyk.getName();
        fryderyk.getWeight();
        tamara.getName();
        tamara.getWeight();

        fryderyk.eat(2, "ladybird");
        fryderyk.eat(1, "ant");
        fryderyk.getWeight();
        fryderyk.setName("Fryderyk Wielki");
        fryderyk.getName();
        fryderyk.hideAndRun();

        tamara.letOut();
        tamara.climb();
        tamara.eat(1, "bamboo");
        tamara.setFavPlant("carrot");
        tamara.getFavPlant();
        tamara.getWeight();

    }
}
