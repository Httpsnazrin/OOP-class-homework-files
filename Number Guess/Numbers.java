import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101); // Random number between 0 and 100

        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int[] guesses = new int[100]; // Array to store user guesses
        int count = 0;

        while (true) {
            int guess = getValidNumber(scanner); // Ensures valid number input
            guesses[count++] = guess; // Store guess in array

            if (guess < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > secretNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        // Sort the guesses in descending order before displaying
        int[] result = Arrays.copyOf(guesses, count);
        Arrays.sort(result);
        System.out.print("Your numbers: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }
    }

    private static int getValidNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
