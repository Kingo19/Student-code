import java.util.Scanner;

public class comm1 {
    public static void main(String[] args) {
//        Scanner avg = new Scanner(System.in);
//        System.out.println("First number");
//        int num1 = avg.nextInt();
//        System.out.println("Second number");
//        int num2 = avg.nextInt();
//        System.out.println("Third number");
//        int num3 = avg.nextInt();
//        System.out.println(sumAvg(num1, num2, num3));

//        System.out.println("Enter even numbers");
//        Scanner loop = new Scanner(System.in);
//        int num = loop.nextInt();
//        for (int z = 2; z<= num; z = z+2) {
//            System.out.println(z);

//      }

        Scanner hi = new Scanner(System.in);
        System.out.println("Enter your first name");
        String hel1 = hi.nextLine();
        System.out.println("Enter your last name");
        String hel2 = hi.nextLine();
        System.out.println("Hello " + myName(hel1, hel2) + "!");

        Scanner tempConvert = new Scanner(System.in);






    }
    public static int sumAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static String myName(String firstName, String lastName) {
        return firstName + lastName;
    }





}
