
import java.util.Scanner;

public class permutationInverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to apply Permutation Inverse: ");
        int ogNumber = sc.nextInt();
        if(ogNumber == 0){
            System.out.println("Enter a valid Number!");
        }
        else{

        System.out.println("Original Number = " + ogNumber);

        int ogPosition = 1;

        int invNumber = 0;

        for(int i = 0; ogNumber > 0; i++){
            int digit = ogNumber % 10;

            int invPosition = digit;
            invNumber += ogPosition * (int)Math.pow(10, invPosition - 1);

            ogNumber /= 10;
            ogPosition++;
        }

        System.out.println("Inverse number (Permutation Inverse) = " + invNumber);
        }
    }
}