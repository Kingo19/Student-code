public class Vehicle {
    String name;
    String colour;
    int numberOfwheel;
    double cc;


    String engineSound(String shout) {
       return shout;
    }

    public Vehicle(String name, String colour, int numberOfwheel, double cc) {

        this.name = name;
        this.colour = colour;
        this.numberOfwheel = numberOfwheel;
        this.cc = cc;
    }
}
