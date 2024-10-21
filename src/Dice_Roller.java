import java.util.Random;
import java.util.Scanner;

public class Dice_Roller {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            int rollCount = 0;
            System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print the roll details
                System.out.printf("%-10d%-10d%-10d%-10d%-10d\n", rollCount, die1, die2, die3, sum);

                // Break the loop if all three dice have the same value (triple)
                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            // Ask the user if they want to continue
            System.out.println("\nTriple rolled! Do you want to play again? (y/n)");
            userInput = scanner.nextLine().toLowerCase();

        } while (userInput.equals("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}