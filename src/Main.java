import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        exercise1();
    }

    /**
     * Write a program that guesses a random number from 0 to 9 and the user is given 3 attempts to guess this number.
     * On each attempt, the computer must report whether the user-specified number is greater than or less than the
     * guessed number. After a win or loss, a prompt is displayed - “Repeat the game again? 1 - yes / 0 - no
     * "(1 - repeat, 0 - no).
     */
    private static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int stp = 1;

        while (stp == 1) {
            int rnd = random.nextInt(10);
            System.out.println("Try to guess the number. You have 3 attempts " + rnd);
            for (int i = 0; i < 3; i++) {
                int a = scanner.nextInt();

                // Check entered value
                if (a > rnd) {
                    System.out.println("Your number is higher than expected");
                } else if (a < rnd) {
                    System.out.println("Your number is less");
                } else {
                    System.out.println("You win! The number is " + rnd);
                    break;
                }
            }

            // Check repeating.
            System.out.println("Repeat the game again? If Yes - 1, If NO - 0");
            int repeat = scanner.nextInt();
            if (repeat == 0) {
                System.out.println("Game over");
               break;
            }
        }
    }
}