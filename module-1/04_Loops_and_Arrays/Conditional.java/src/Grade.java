public class Grade{
    public static void main(String[] args) {
        String score = score(83);
        System.out.println(score);
    }
   public static String score(int Number) {
        if (Number >= 90) {
            return "A";
        } else if (Number >= 80) {
            return "B";
        } else if (Number >= 70) {
            return "C";
        } else if (Number >= 60) {
            return "D";
        } else {
            return "F";
        }
   }
}
