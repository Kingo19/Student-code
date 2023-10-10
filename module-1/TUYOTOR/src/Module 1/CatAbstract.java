public class CatAbstract extends AnimalAbstract{
    public CatAbstract(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says Meaou!");
    }
}
