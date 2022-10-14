import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Who is player 1? ");
        String player1Name = scan.nextLine();

        System.out.print("Who is player 2? ");
        String player2Name = scan.nextLine();

        double player1Num = Math.random();
        double player2Num = Math.random();

        System.out.println("Player 1's number: " + player1Num);
        System.out.println("Player 2's number: " + player2Num);

        if (player1Num > player2Num) {
            System.out.println("Player 1 wins the bet!");
        } else if (player2Num > player1Num){
            System.out.println("Player 2 wins the bet!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
