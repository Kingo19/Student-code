public class ford extends Car {
    public static void main(String[] args) {
        ford focus = new ford();
        System.out.println(focus.brand);
        System.out.println(focus.noOfEngine);
//        Because it's void and has no return in the Superclass sys.out... is not mandatory.
        focus.honk();

    }


}
