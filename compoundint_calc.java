import java.util.Scanner;

public class compoundint_calc {
    public static void main(String[] args) {
        /*
         * A = P[1 + r/n]^nt
         */
        Scanner scan = new Scanner(System.in);  

        double Principal_amt, interest, int_dec, Amount;
        int time, n;// n = number of times interest is compounded per year

        System.out.print("Enter Principal Amount(P)(in $): ");
        Principal_amt = scan.nextDouble();

        System.out.print("Enter compound interest applied(r)(in %): ");
        interest = scan.nextDouble();

        int_dec = interest / 100;

        System.out.print("Enter the number of years(t): ");
        time = scan.nextInt();

        System.out.print("Enter number of times interest is compounded per year(n): ");
        n = scan.nextInt();

        Amount = Principal_amt * (Math.pow(1 + (int_dec / n), n * time));

        System.out.printf("The Final Amount to be paid after compound interests applied is %.2f", Amount);

        scan.close();
    }
}
