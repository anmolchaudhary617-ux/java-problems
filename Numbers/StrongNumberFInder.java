
import java.util.Scanner;

public class StrongNumberFinder {

    public static void main(String[] args) {
        /*Write a Java program that:
        Takes two integers as input: start and end.
        Prints all Strong Numbers between start and end (inclusive).
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        /*
        145 = 1! + 4! + 5! = 1 + 24 + 120
        145 % 10 = 5
        sum += factorial(5)
        145 / 10 = 14
        14 % 10 = 4
         */
        for (int i = start; i <= end; i++) {
            if (i == 0) {
                continue;
            }
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;

                sum += factorial(digit);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    static int factorial(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        } else {
            return digit * factorial(digit - 1);
        }
    }
}
