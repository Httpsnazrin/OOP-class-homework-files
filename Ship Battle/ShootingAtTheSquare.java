import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialize game field
        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }

        // Set random target position
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            // Get valid row input
            int row = getValidNumber(scanner, "Enter row (1-5):") - 1;

            // Get valid column input
            int col = getValidNumber(scanner, "Enter column (1-5):") - 1;

            // Check if the target is hit
            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                if (field[row][col] == '-') {
                    field[row][col] = '*'; // Mark missed shots
                }
                printField(field);
            }
        }
    }

    // Function to validate user input (ensures number in range 1-5)
    private static int getValidNumber(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 1 && num <= 5) {
                    return num;
                }
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }

    // Function to print the game field
    private static void printField(char[][] field) {
        System.out.println("\n  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
