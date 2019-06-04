package zoo;

public class Armadillo extends Animal {
    private boolean hasArmour;

    public Armadillo(String animalName,  String animalFavFood, int animalWeight, boolean animalInCage) {
        super(animalName, animalFavFood, animalWeight, animalInCage);
        hasArmour = true;
    }

    public void hideAndRun() {
        System.out.println("Curl inside my shell 'n' roll!");
    }
}
