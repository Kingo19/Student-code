package Example1;

public class Animal {
    private String name;
    private int numberOfLegs;
    private boolean areCarniverous;

    public Animal(String name, int numberOfLegs, boolean areCarniverous) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.areCarniverous = areCarniverous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isAreCarniverous() {
        return areCarniverous;
    }

    public void setAreCarniverous(boolean areCarniverous) {
        this.areCarniverous = areCarniverous;
    }

    public Animal() {
    }
}

