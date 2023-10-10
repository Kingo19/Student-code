public class Square implements Shapes {
    int length;

    public Square(int length) {
        this.length = length;

    }

    public double perimeter() {
        int per2 = length * 4;
        return per2;
    }
}
