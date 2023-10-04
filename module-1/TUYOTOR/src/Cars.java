public class Cars extends Vehicle {
    public Cars(String name, String colour, int numberOfwheel, double cc) {
        super(name, colour, numberOfwheel, cc);

    }

    @Override
    String engineSound(String shout) {
       return super.engineSound(shout);
    }
}
