public class Bajaj extends Vehicle {
    public Bajaj(String name, String colour, int numberOfwheel, double cc) {
        super(name, colour, numberOfwheel, cc);

    }

    @Override
    String engineSound(String shout) {
        return shout;
    }
}
