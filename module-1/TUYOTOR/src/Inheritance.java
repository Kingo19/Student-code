public class Inheritance {
    //    INHERITED OBJECTED FROM OTHER CLASS.
    public static void main(String[] args) {
        Dog one = new Dog("Buchi", 4);
        Cat two = new Cat("Wuro", 4);
        Monkey three = new Monkey("Tota", 2);

        System.out.println("my Dog name is" + " " + one.name);
        System.out.println("my Cat name is" + " " + two.name);
        System.out.println("my Monkey name is" + " " + three.name);
        System.out.println("my Dog leg is" + " " + one.numberOfLegs);
        System.out.println("my Cat leg is" + " " + two.numberOfLegs);
        System.out.println("my Monkey leg is" + " " + three.numberOfLegs);

    }

}
