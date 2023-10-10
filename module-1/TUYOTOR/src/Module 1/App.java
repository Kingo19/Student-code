public class App {
    public static void main(String[] args) {
        ManchesterUnited player1 = new ManchesterUnited("Bruno", "Fernandes", "Attacking Midfielder", 8, 9.2, true);

//        player1.firstName = "Bruno";
//        player1.lastName = "Fernades";
//        player1.position = "Attacking Midfielder";
//        player1.rating = 8.9;
//        player1.goodEnough = true;


        ManchesterUnited player2 = new ManchesterUnited("Scott", "McTominay", "Midfielder", 39, 3.3, false);
//        player2.firstName = "Scott";
//        player2.lastName = "Mctominay";
//        player2.position = "Midfielder";
//        player2.rating = 4.3;
//        player2.goodEnough = false;

        System.out.println(player1.firstName);
        System.out.println(player2.lastName);
    }
}
