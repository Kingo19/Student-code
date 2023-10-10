public class Exception {
    public static void main(String[] args) {
    //    int res = div(5, 0);
//        try {
//            int res = div(5, 1);
//            System.out.println(res);
//        } catch (ArithmeticException e) {
//            System.out.println("Opppps... a number can not divided by 0");
//        }
        String name = null;
//        int length = name.length();
//        System.out.println(length);

//
//        int [] king={2, 12, 32, 8};
//        System.out.println(king[4]);

        try {
            int [] king={2, 12, 32, 8};
            System.out.println(king[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
