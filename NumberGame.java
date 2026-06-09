import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    score += (maxAttempts - attempt + 1);
                    guessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempt));
            }

            if (!guessed) {
                System.out.println("You lost! The correct number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nFinal Score: " + score);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}
