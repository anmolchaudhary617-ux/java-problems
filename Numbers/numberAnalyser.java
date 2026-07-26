
import java.util.Scanner;

public class numberAnalyser{
    public static void main(String[] args) {
        /*
            Input  => 153
            Output => Sum of digits = 9
                    Number of digits = 3
                    Reverse = 351
                    Palindrome = No
                    Armstrong = Yes
        
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sumOfDigits = sumNumber(num);
        System.out.println("Sum of digits = " + sumOfDigits);

        int noOfDigits = noOfDigitsInNumber(num);
        System.out.println("Number of digits = " + noOfDigits);     

        int reversed = reverseNumber(num);
        System.out.println("Reverse = " + reversed); 

        boolean palindrome = isPalindrome(num);
        if(palindrome){
            System.out.println("Palindrome = Yes");
        }
        else
            System.out.println("Palindrome = No");

        boolean armstrong = isArmstrong(num);
          if(armstrong){
            System.out.println("Armstrong = Yes");  
        }
        else
            System.out.println("Armstrong = No");

    }

    static int noOfDigitsInNumber (int num){
        int countOfDigits = 0;
            if (num == 0) {
                countOfDigits = 1;
            }
        while (num > 0) { 
            num /= 10;

            countOfDigits++;
        }
        return countOfDigits;
    }

    static int sumNumber (int num){
        int sum = 0;
        while (num > 0) { 
            int digit = num % 10;
            
            num /= 10;

            sum += digit;
        }
        return sum;
    }

    static int reverseNumber(int num){
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;

            num /= 10;

            reverse = reverse * 10 + digit;
        }
        return reverse;
    }

    static boolean isPalindrome(int num){

        return num == reverseNumber(num);
    }

    static boolean isArmstrong(int num){
        int countOfDigits= noOfDigitsInNumber(num);
        int sumOfnPowerDigits = 0;
        int ogNumber = num;

         if (num == 0) {
            return true;
        }

        while (num > 0) { 
            int digit = num % 10;

            num /= 10;

            sumOfnPowerDigits += (int)Math.pow(digit, countOfDigits);
        }

        return sumOfnPowerDigits == ogNumber;
    }
    
}