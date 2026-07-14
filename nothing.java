import java.util.Scanner;

public class nothing {
    public static void main(String[] args) {
        /*
         * Write a Java program that:
         * Takes a string from the user
         * Counts:
         * number of uppercase letters
         * number of lowercase letters
         * Prints both counts
         */
        Scanner scan = new Scanner(System.in);

        String str;

        System.out.println("Enter a String(sentence):");
        str = scan.nextLine();

        int upperCount = 0, lowerCount = 0;

        for(int i = 0; i < str.length(); i++){

            char c = str.charAt(i);

            if(c >= 'A' && c <='Z'){
                upperCount++;
            }
            else if(c >= 'a' && c <='z'){
                lowerCount++;
            }
        }

        System.out.println("Number of UpperCase letters in the entered string: "+ upperCount);
        System.out.println("Number of LowerCase letters in the entered string: "+ lowerCount);
        scan.close();
    }
}
