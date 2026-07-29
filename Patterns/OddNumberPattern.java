
import java.util.Scanner;

public class OddNumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        /* 
        1
        13
        135
        1357
        13579
        for n = 5

        */


       for (int i = 1; i <= n; i++) {
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number += 2;
            }
            System.out.println();
       }

    }
}