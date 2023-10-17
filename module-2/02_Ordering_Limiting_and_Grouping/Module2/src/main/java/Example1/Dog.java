package Example1;

public class Dog extends Animal {

    private String name;

    private int numberOfLegs;
    private boolean areCarniverous;

    public Dog(String name, int numberOfLegs, boolean areCarniverous) {
        super(name, numberOfLegs, areCarniverous);
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public boolean isAreCarniverous() {
        return areCarniverous;
    }

    @Override
    public void setAreCarniverous(boolean areCarniverous) {
        this.areCarniverous = areCarniverous;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
