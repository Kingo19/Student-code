public class DogAbstract extends AnimalAbstract {
    public DogAbstract(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(name + " says Woof Woof...");
    }

}
