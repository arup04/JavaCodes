package Sheet9;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashSet<Integer> usedNumbers = new HashSet<>();
        int player1Score = 0, player2Score = 0;

        System.out.println("Welcome to the Two-Player Number Game!");

        for (int round = 1; round <= 5; round++) { // Game runs for 5 rounds
            System.out.println("\n--- Round " + round + " ---");

            // Player 1's turn
            System.out.print("Player 1, enter a unique number: ");
            int player1Input = getUniqueInput(scanner, usedNumbers);

            // Generate random number for Player 1
            int player1Random = random.nextInt(100) + 1; // Random number between 1 and 100
            System.out.println("Player 1 gets random number: " + player1Random);

            // Player 2's turn
            System.out.print("Player 2, enter a unique number: ");
            int player2Input = getUniqueInput(scanner, usedNumbers);

            // Generate random number for Player 2
            int player2Random = random.nextInt(100) + 1; // Random number between 1 and 100
            System.out.println("Player 2 gets random number: " + player2Random);

            // Determine the winner of the round
            if (player1Random > player2Random) {
                int points = player1Random - player2Random;
                player1Score += points;
                System.out.println("Player 1 wins this round and earns " + points + " points!");
            } else if (player2Random > player1Random) {
                int points = player2Random - player1Random;
                player2Score += points;
                System.out.println("Player 2 wins this round and earns " + points + " points!");
            } else {
                System.out.println("It's a tie! No points awarded.");
            }
        }

        // Final scores and winner
        System.out.println("\n--- Final Scores ---");
        System.out.println("Player 1: " + player1Score + " points");
        System.out.println("Player 2: " + player2Score + " points");

        if (player1Score > player2Score) {
            System.out.println("Player 1 is the overall winner!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 is the overall winner!");
        } else {
            System.out.println("The game is a tie!");
        }
    }

    // Function to get a unique input number
    public static int getUniqueInput(Scanner scanner, HashSet<Integer> usedNumbers) {
        int number;
        while (true) {
            number = scanner.nextInt();
            if (!usedNumbers.contains(number)) {
                usedNumbers.add(number);
                break;
            } else {
                System.out.print("Number already used! Enter another number: ");
            }
        }
        return number;
    }
}
