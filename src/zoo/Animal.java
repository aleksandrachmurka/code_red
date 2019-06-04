package zoo;

public class Animal {
    private String name;
    private String favFood;
    private int weight;
    private boolean inCage;

    public Animal(String animalName, String animalFavFood, int animalWeight, boolean animalInCage) {
        name = animalName;
        favFood = animalFavFood;
        weight = animalWeight;
        inCage = animalInCage;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int eat(int kilos) {
        return weight += kilos;
    }

    public boolean letOut() {
        return inCage != inCage;
    }

}
