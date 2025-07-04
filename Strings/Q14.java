package strings;

import java.util.Random;
import java.util.Scanner;

class Q14 {

    public static String getChoiceName(int choice) {
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissor";
            default -> "invalid";
        };
    }

    public static int computerChoice() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public static String Winner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "Draw";
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        double playerPercent = ((double) playerWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercent);

        return stats;
    }

    public static void displayResults(String[] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Game", "Player", "Computer", "Winner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.print(gameResults[i]);
        }

        System.out.println("\nSummary Stats:");
        System.out.printf("%-10s %-10s %-10s\n", "Name", "Wins", "Win %");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-10s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int humanwin = 0, computerwin = 0;

        System.out.println("Welcome to my game 🥸🥸🥸");
        System.out.println("rock: 0\npaper: 1\nscissors: 2");

        System.out.println("Enter number of games you want to play:");
        int n = sc.nextInt();

        String[] gameResults = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (0/1/2): ");
            int playerChoice = sc.nextInt();
            int compChoice = computerChoice();

            String winner = Winner(playerChoice, compChoice);
            if (winner.equals("Player")) {
                humanwin++;
            } else if (winner.equals("Computer")) {
                computerwin++;
            }

            gameResults[i] = String.format("%-10d %-10s %-10s %-10s\n", (i + 1),
                    getChoiceName(playerChoice), getChoiceName(compChoice), winner);
        }

        String[][] stats = calculateStats(humanwin, computerwin, n);
        displayResults(gameResults, stats);
    }
}
