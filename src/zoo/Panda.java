package zoo;

public class Panda extends Animal {
    private boolean isCute;

    public Panda(String animalName,  String animalFavFood, int animalWeight, boolean animalInCage) {
        super(animalName, animalFavFood, animalWeight, animalInCage);
        isCute = true;
    }

    public void climb() {
        System.out.println("Climb high to grab a tasty snack");
    }
}
