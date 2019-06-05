package zoo;

public abstract class Animal {
    String name;
    int weight;
    boolean inCage;

    public Animal(String animalName, int animalWeight, boolean animalInCage) {
        name = animalName;
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

    public boolean letOut() {
        return inCage != inCage;
    }

    public abstract int eat(int kilos, String food);

}
