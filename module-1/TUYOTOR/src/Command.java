import java.util.*;
public class Command {
    public static void main(String[] args) {
        Scanner king = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = king.nextInt();
        System.out.println("Inter the second number");
        int num2 = king.nextInt();
        System.out.println(add(num1, num2));



    }

    public static int add(int x, int y) {
        return x + y;
    }


}