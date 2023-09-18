import java.util.Arrays;

public class Array {
         static int[] num = {21, 19,16};
    public static void main(String[] args) {
        String[] name = {"King", "Yotor", "Abebe"};
        String y = name[0];
        String x = name[1];
        System.out.println(y);

        name[2] = "Kebede";
        String v = name[2];
        System.out.println(v);

        int s = name.length;
        System.out.println(s);

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));






    }

}
