import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        /*
         * Write a Java program that:
         * Takes a string input from the user
         * Uses a for loop
         * Checks whether the string is a palindrome
         * Prints:
         * "Palindrome" if it is
         * "Not a palindrome" if it is not
         */
        Scanner scan = new Scanner(System.in);

        String str;

        System.out.print("Enter a String: ");
        str = scan.nextLine();

        boolean isPalindrome = true; 

        for(int i = 0 ; i < str.length() / 2 ; i++){
            boolean check = str.charAt(i) != str.charAt(str.length() - 1 - i);
            if (check) {
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Entered String is a Palindrome.");
        }
        else{
            System.out.println("Entered String is not a Palindrome.");
        }
        scan.close();
    }
}
