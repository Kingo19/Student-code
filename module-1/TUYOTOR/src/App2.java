public class App2 {
    public static void main(String[] args) {
        Cars car1 = new Cars("Totota", "Red", 4, 2.8);
        Bajaj baj = new Bajaj("TVS", "Blue", 3, 0.8);
        Bike motorBike = new Bike("Yamaha", "Black", 2, 0.6);

        System.out.println("Name" + " " + car1.name);
        System.out.println("Colour" + " " + baj.colour);
        System.out.println("NOW" + " " + motorBike.numberOfwheel);

        System.out.println("It Sounds " + car1.engineSound("Hmmmmm"));
        System.out.println("It sounds like "  + baj.engineSound("Kurrrrr"));
        System.out.println("It often sounds  "  + motorBike.engineSound("Tirrrr"));

    }

}
