public abstract class AnimalAbstract {
    public String name;

    public AnimalAbstract(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleepiing");
    }
}
