package dice_game;


public class GameEngine {
    private Dice dice;
    private Player player1;
    private Player player2;

    public GameEngine(Player p1, Player p2) {
        this.dice = new Dice();
        this.player1 = p1;
        this.player2 = p2;
    }

    public void playRound() {
        int roll1 = dice.roll();
        int roll2 = dice.roll();

        System.out.println(player1.getName() + " rolled: " + roll1);
        System.out.println(player2.getName() + " rolled: " + roll2);

        if (roll1 > roll2) {
            player1.incrementWins();
            System.out.println(player1.getName() + " wins the round!");
        } else if (roll2 > roll1) {
            player2.incrementWins();
            System.out.println(player2.getName() + " wins the round!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public void showResults() {
        System.out.println("\n--- Final Results ---");
        System.out.println(player1.getName() + " wins: " + player1.getWins());
        System.out.println(player2.getName() + " wins: " + player2.getWins());

        if (player1.getWins() > player2.getWins()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getWins() > player1.getWins()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}
