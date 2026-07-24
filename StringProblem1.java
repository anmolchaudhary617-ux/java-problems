
import java.util.Scanner;

public class StringProblem1{
    public static void main(String[] args) {
        // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        Scanner sc = new Scanner(System.in);
        int lengthCount = 0;

        System.out.print("Enter the number of strings you would like to enter: ");
        int noOfStrings = sc.nextInt();
        String[] arr = new String[noOfStrings];

        for (int i = 0; i < noOfStrings; i++) {
            System.out.print("Enter String(" + i + "): ");
            arr[i] = sc.next();            
        }
        
        for (String arr1 : arr) {
            lengthCount += arr1.length();
        }

        System.out.println("The cumulative (combined) length of all the entered strings is: " + lengthCount);
    }
}