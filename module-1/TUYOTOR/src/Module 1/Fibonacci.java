import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter a number.");
        Scanner convFibo = new Scanner(System.in);
        int fibonacci = convFibo.nextInt();
        int x = 0;
        int y = 1;
        for (int i = 2; i < fibonacci; i++) {
            int sum = x + y;
            System.out.println(sum);
            x = y;
            y = sum;
        }


    }
}
