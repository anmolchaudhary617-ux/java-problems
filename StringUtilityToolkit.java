
import java.util.Scanner;

public class StringUtilityToolkit {

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

        sc.nextLine();

        if (choice < 1 || choice > 7) {
            System.out.println("Please enter a valid choice from above!!");
        } else {
            switch (choice) {
                case 1 -> {
                    string = "";
                    while (string.isEmpty()) {
                        System.out.print("Please enter a string to get its reverse: ");
                        string = sc.nextLine().trim();

                        if (string.isEmpty()) {
                            System.out.println("Error: Input cannot be empty. Try again.");
                        }
                    }
                    System.out.println("Reverse of " + string + "is: " + reverseString(string));
                }
                case 2 -> {
                    int noOfVowels = countVowels(string);

                    System.out.println("There are " + noOfVowels + "number of vowels in \"" + string + "\"");
                }
                case 3 -> {
                    int noOfConsonants = countConsonants(string);

                    System.out.println("There are " + noOfConsonants + "number of consonants in \"" + string + "\"");
                }
                case 4 -> {
                    boolean isPalindrome = checkIfPalindrome(string);

                    if (isPalindrome) {
                        System.out.println("\"" + string + "\" is a Palindrome"); 
                    }else {
                        System.out.println("\"" + string + "\" is not a Palindrome");
                    }
                }
                case 5 -> {
                    int noOfWords = countWords(string);

                    System.out.println("There are " + noOfWords + " number of words in \"" + string + "\"");
                }
                case 6 -> {
                        System.out.print("Enter the character you want to replace : ");
                        char c1 = sc.next().charAt(0);

                        System.out.print("Enter the replacement character: ");
                        char c2 = sc.next().charAt(0);

                        System.out.println("New string after character replacement: " + replaceCharacter(string, c1, c2));
                }
                case 7 -> {
                    System.out.println("Thank you!");
                }

            }
        }
    }

    static int countVowels(String s) {
        int count = 0;
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    static int countConsonants(String s) {
    int count = 0;
    String str = s.toLowerCase();
    
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        
        if (ch >= 'a' && ch <= 'z') {
            
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
    }
    return count;
}


    static boolean checkIfPalindrome(String s) {
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

    static int countWords(String s) {
        //H e l l o _ W o r l d
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        return s1;
    }

    static String replaceCharacter(String s, char c1, char c2){
        StringBuilder s1 = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1){
               s1.append(c2);
            }
            else s1.append(s.charAt(i));
        } 
        return s1.toString();
    }
}
