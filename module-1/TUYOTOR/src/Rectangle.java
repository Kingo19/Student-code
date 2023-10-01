public class Rectangle implements Polygon {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea() {
        return length * width;

    }
}
