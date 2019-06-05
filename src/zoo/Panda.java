package zoo;

public class Panda extends Animal {
    private boolean isCute;
    private String favPlant;

    public Panda(String animalName,  int animalWeight, boolean animalInCage) {
        super(animalName, animalWeight, animalInCage);
        isCute = true;
        favPlant = "bamboo";
    }

    public void climb() {
        System.out.println("Climb high to grab a tasty snack");
    }

    public void setFavPlant(String favPlant) {
        this.favPlant = favPlant;
    }

    public String getFavPlant() {
        return favPlant;
    }

    public int eat(int kilos, String food){
        if (food.equals(favPlant)) {
            System.out.println("Yummy!");
        }
        return weight += kilos/2;

    }
}
