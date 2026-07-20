import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        /*
         * Write a Java program that does the following:
         * Ask the user to enter a positive integer n.
         * Using a for loop, calculate:
         * The sum of all numbers from 1 to n
         * The count of even numbers between 1 and n
         * The count of odd numbers between 1 and n
         * Check whether n itself is:
         * Even or odd
         * Print all results clearly.
         */
        Scanner scan = new Scanner(System.in);

        int userNumber;
        int countOfEvenno = 0, countOfOddno = 0, sum = 0;

        System.out.print("Enter a positive integer: ");
        userNumber = scan.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            sum += i;

            if (i % 2 == 0) {
                countOfEvenno++;
            } else {
                countOfOddno++;
            }
        }
        System.out.print("\nSum of all positive integers from 1 to " + userNumber + ": " + sum);
        System.out.printf("\nThe number of Even numbers between 1 to %d is %d", userNumber, countOfEvenno);
        System.out.printf("\nThe number of Odd numbers between 1 to %d is %d", userNumber, countOfOddno);
        if (userNumber % 2 == 0) {
            System.out.println("\nThe positive integer entered by you is an Even number. ");
        } else {
            System.out.println("\nThe positive integer entered by you is an Odd number.");
        }
    }
}
