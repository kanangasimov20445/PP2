package week02;

import java.util.Scanner;
import java.util.Random;
public class DiceMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter your guess between 2 and 12, or 0 to quit): ");
            int guess = scanner.nextInt();
            if (guess == 0) {
                System.out.println("Game over.");
                break;
            }
            if (guess < 2 || guess > 12) {
                System.out.println("Are you sure you have correct number of dices?");
                continue;
            }
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Computer rolled: " + die1 + " and " + die2);
            if (sum == guess) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        scanner.close();
    }
}