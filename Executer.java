package dice_game;


import java.util.Scanner;

public class Executer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Player 2 name: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GameEngine game = new GameEngine(player1, player2);

        System.out.print("How many rounds to play? ");
        int rounds = scanner.nextInt();

        for (int i = 0; i < rounds; i++) {
            System.out.println("\n--- Round " + (i + 1) + " ---");
            game.playRound();
        }

        game.showResults();
        scanner.close();
    }
}
