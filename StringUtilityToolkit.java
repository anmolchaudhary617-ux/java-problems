import java.util.Scanner;

public class StringUtilityToolkit{
    public static void main(String[] args) {
            /*
            ========== String Utility Toolkit ==========

            1. Reverse String
            2. Count Vowels
            3. Count Consonants
            4. Check Palindrome
            5. Count Words
            6. Replace Character
            7. Exit
            */
            Scanner sc = new Scanner(System.in);

            System.out.println(" ========== String Utility Toolkit ==========\n");
            System.out.println("1. Reverse String");
            System.out.println("2. Count Vowels");
            System.out.println("3. Count Consonants");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Count Words");
            System.out.println("6. Replace Character");
            System.out.println("7. Exit");

            System.out.print("Enter a String: ");
            String string = sc.nextLine();
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); 
            
            if (choice < 1 || choice > 7) {
               System.out.println("Please enter a valid choice from above!!"); 
            }
            else{
                switch (choice) {
                    case 1 -> {

                    }
                    case 2 -> {
                        int noOfVowels = countVowels(string);

                        System.out.println("There are " + noOfVowels + "number of vowels in \"" + string + "\"");
                    }
                    case 3 -> {
                        int noOfConsonants = countConsonants(string);

                        System.out.println("There are " + noOfConsonants + "number of vowels in \"" + string + "\"");
                    }
                    case 4 -> {
                        boolean isPalindrome = checkIfPalindrome(string);

                        if(isPalindrome) System.out.println("\"" + string + "\" is a Palindrome");
                        else System.out.println("\"" + string + "\" is not a Palindrome");
                    }
                    case 5 -> {
                        int noOfWords = countWords(string);

                        System.out.println("There are " + noOfWords + "number of words in \"" + string + "\"");
                    }
                    case 6 -> {
                        
                    }
                    case 7 -> {
                        System.out.println("Thank you!");
                    }

                }
            }
    }

    static int countVowels(String s){
        int count = 0;
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    static int countConsonants(String s){
        return (s.length() - countVowels(s));
    }

    static boolean checkIfPalindrome(String s){
        int right = s.length() - 1;
        int left = 0;
        while (left < right) { 
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static int countWords(String s){
        
    }
}