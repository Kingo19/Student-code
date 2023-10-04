public class MainAbstract {
    public static void main(String[] args) {
        DogAbstract dog1 = new DogAbstract("Buchi");
        CatAbstract cat1 = new CatAbstract("Wuro");

        dog1.makeSound();
        dog1.sleep();
        cat1.makeSound();
        cat1.sleep();
        System.out.println(1/0);

       String name = null;
        System.out.println(name);
    }

}
