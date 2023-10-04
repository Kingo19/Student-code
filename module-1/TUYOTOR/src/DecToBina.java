import java.util.Scanner;

public class DecToBina {
    public static void main(String[] args) {

        System.out.println("Enter decimal number.");
        Scanner convBinary = new Scanner(System.in);
        int decimal = convBinary.nextInt();
        String binary = " - This is the binary number.";
        while (decimal>0) {
            int reminder = decimal % 2;
            binary = reminder + binary;
            decimal = decimal / 2;
        }

        System.out.println(binary);


    }


    }
