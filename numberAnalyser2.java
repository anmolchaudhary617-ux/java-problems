import java.util.Scanner;
public class numberAnalyser2 {
    public static void main(String[] args) {
        /*
        ===== Number Analyzer =====

        1. Count Digits
        2. Reverse Number
        3. Check Palindrome 
        4. Check Armstrong
        5. Check Strong Number
        6. Exit
        */
       Scanner sc = new Scanner(System.in);
       String userChoice = "n";

       do { 
       System.out.println("==== Number Analyser ====\n");
       System.out.println("1. Count digits");
       System.out.println("2. Reverse Number");
       System.out.println("3. Check Palindrome");
       System.out.println("4. Check Armstrong");
       System.out.println("5. Check Strong");
       System.out.println("6. Exit");
        
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        if (choice == 6) {
            System.out.println("Thank you!");
            return; 
        }

        System.out.print("Number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Sorry, this program is for positive numbers!");
            continue;
        }


        if(choice < 1 || choice > 6){
            System.out.println("Please enter a valid choice from above!!");
        }
        else{
           switch (choice) {
               case 1 -> {
                   int noOfDigits = countDigits(number);
                   System.out.println(noOfDigits);
               }
               case 2 -> {
                   int reversedNumber = reverseNumber(number);
                   System.out.println(reversedNumber);
               }
               case 3 -> {
                   boolean isPalindrome = checkIfPalindrome(number);
                   if(isPalindrome) System.out.println("Yes");
                   else System.out.println("No");
               }
               case 4 -> {
                   boolean isArmstrong = checkIfArmstrong(number);
                   if(isArmstrong) System.out.println("Yes");
                   else System.out.println("No");
               }
               case 5 -> {
                   boolean isStrong = checkIfStrong(number);
                   if(isStrong) System.out.println("Yes");
                   else System.out.println("No");
               }
           }
           System.out.print("Do you wish to Continue[Y/N]? ->");
           userChoice = sc.next();
           if(userChoice.toLowerCase().equals("n")){
            System.out.println("Thank you!");
            return;
           }
        }
       } while (userChoice.toLowerCase().equals("y"));
    }
    static int countDigits(int n){
        int totalDigits = 0;
        
        if (n == 0) {
            return 1;
        }
        while (n > 0){
            n /= 10;
            totalDigits++;
        }
        return totalDigits;
    }

    static int reverseNumber(int n){
        int sum = 0;
        while (n > 0) { 
            int digit = n % 10;

            sum = (sum * 10) + digit;
            n /= 10;
        }
        return sum;
    }

    static boolean checkIfPalindrome(int n){
        return n == reverseNumber(n); 
    }

    static boolean checkIfArmstrong(int n){
        int totalDigits = countDigits(n);
        int originalNumber = n;
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;

            sum += (int) Math.pow(digit , totalDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }

    static boolean checkIfStrong(int n){
      int originalNumber = n;
      int sum = 0;
      while (n > 0) { 
          int digit = n % 10;

          sum += factorial(digit);
          n /= 10;
      }
      return sum == originalNumber;
    }

    static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else return n * factorial(n - 1);
    }
}
