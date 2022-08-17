import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //  exercise1();
        exercise2();
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
            System.out.println("Try to guess the number. You have 3 attempts ");
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
    /**
     * When the program starts, the computer guesses a word, asks the user for an answer, compares it with the hidden
     * word and reports whether the user answered correctly. If the word is not guessed, the computer shows the
     * letters that are in their places.
    */
    private static void exercise2() {
        String[] words = {"apple", "orange",
                "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        Random random = new Random();
        Scanner scanner2 = new Scanner(System.in);
        int random2 = random.nextInt(24);
        String secret = words[random2];
        System.out.println("Guess the food. Write your version: " + secret);

        while (true) {
            String userVer = scanner2.next();
            if ((userVer.equals(secret))) {
                System.out.println("You Win! The word is " + secret);
                break;
            }
            for (int i = 0; i < secret.length(); i++) {
                char compareLetter1 = secret.charAt(i);
                char compareLetter2 = userVer.charAt(i);
                if (compareLetter1 == compareLetter2) {
                    System.out.print(compareLetter1);
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("\nTry again");
        }
    }

}