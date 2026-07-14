
import java.util.Scanner;

public class floydsTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 1;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        /* 
        1
        2 3
        4 5 6 
        7 8 9 10 for n = 4
        */
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(current + " ");
               current++;
           }
           System.out.println();
       }
}
}