import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
//        Scanner king = new Scanner(System.in);
//        System.out.println("Enter your name.");
//        String name = king.nextLine();
//        System.out.println("Your name is" + " " + name);

        Scanner yotor = new Scanner(System.in);
//        System.out.println("Enter your age?");
//        int age = yotor.nextInt();
//        System.out.println("My age is" + " " + age);

//        System.out.println("Enter a series of numbers.");
//        String y = yotor.nextLine();
//        String[] number = y.split(", ");

        int num = 42;
        double pi = 3.14159;
        String name = "John";

        System.out.printf("The number is: %d%n", num);
        System.out.printf("The value of pi is approximately: %.2f%n", pi);
        System.out.printf("Hello, %s!%n", name);

        


    }

}
