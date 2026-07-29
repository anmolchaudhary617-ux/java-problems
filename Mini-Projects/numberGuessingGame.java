import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int guessedNumber, randomNumber;

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");
        randomNumber = random.nextInt(1, 101);

        while (true) {
            System.out.print("Enter a guess: ");
            guessedNumber = scan.nextInt();

            if (guessedNumber > randomNumber) {
                System.out.println("TOO HIGH! Try again");
            } else if (guessedNumber < randomNumber) {
                System.out.println("TOO LOW! Try again");
            } else {
                System.out.println("CORRECT!!");
                scan.close();
                break;
            }
        }
        scan.close();
    }
}