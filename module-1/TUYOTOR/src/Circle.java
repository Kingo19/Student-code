public class Circle implements Shapes {
    int radius;

   public Circle(int radius) {
        this.radius = radius;

    }


    public double perimeter() {
       double cir = 6.28 * radius;
        return cir;
    }
}
