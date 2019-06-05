package zoo;

public class Armadillo extends Animal {
    private boolean hasArmour;
    private String favInsect;

    public Armadillo(String animalName,  int animalWeight, boolean animalInCage) {
        super(animalName, animalWeight, animalInCage);
        hasArmour = true;
        favInsect = "ant";
    }

    public void setFavInsect(String favInsect) {
        this.favInsect = favInsect;
    }

    public String getFavInsect() {
        return favInsect;
    }

    public void hideAndRun() {
        System.out.println("Curl inside my shell 'n' roll!");
    }

    public int eat(int kilos, String food){
        if (food.equals(favInsect)) {
            System.out.println("Delicious!");
        }
        return weight += kilos;

    }

}
