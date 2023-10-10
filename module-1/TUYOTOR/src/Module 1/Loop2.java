public class Loop2 {
    public static void main(String[] args) {
//        Java program that prints 1-10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;

        }
        int k = 5;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);

//        //    Write a Java program to find all even numbers between 1 and 100 (inclusive).
////        for (int a = 2; a <= 100; a = a+2) {
////            System.out.println(a);
////
////        }
////
//////        Write a Java program to calculate the factorial of a given number.
////        int factorial = 1;
////        int num = 6;
////        for (int b = 1; b <= num; b++) {
////            factorial = factorial * b;
////        }
////        System.out.println(factorial);
//
//    }
//        Problem 3: Sum of Even Numbers between 1 and 100.
        int sum = 0;
        for (int c = 1; c <= 100; c++) {
            sum = sum + c;
        }
        System.out.println(sum);
//    Write  a java program that finds the product of all even numbers from 1 to 20.
        int prod = 1;
        for (int d = 2; d <= 12; d= d+2) {
            prod = prod * d;
        }
         System.out.println(prod);

//        Average of sum
        int sum2 = 0;
        for (int e = 1; e<=100; e = e+1) {
            sum2 = sum2 + e;
        }
        System.out.println(sum2/100);

//        This loop generates the multiplication table for a given number up to a specified range.

        int mult= 1;
        int num = 8;
        for (int g=1; g<=10; g = g +1) {
            mult = num * g;
            System.out.println(num + " * " + g + " = " + mult);
        }

        int numbers[] = {12, 3, 7, 19, 10, 16};
        for (int numb: numbers) {
            System.out.println(numb);
        }

        String king[] = {"Yotor,", "Abreham", "Nigus"};
        for (String ppls : king) {
            System.out.println(ppls);
        }





    }




}
