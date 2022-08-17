import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        exercise1();
    }

    private static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rnd = random.nextInt(10);
        System.out.println("Try to guess the number " + rnd);

        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            if (a > rnd) {
                System.out.println("Your number is higher than expected");
            } else if (a < rnd) {
                System.out.println("Your number is less");
            } else {
                System.out.println("You win! The number is " + rnd);
                break;
            }
        }

    }

}