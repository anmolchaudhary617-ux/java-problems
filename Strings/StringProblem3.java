
import java.util.Scanner;

public class StringProblem3{
    public static void main(String[] args) {
        // Input an email from the user. You have to create a username from the email by deleting the part 
        // that comes after ‘@’. Display that username to the user.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your email: ");
        String s = sc.next();
        if (s.indexOf('@') == -1) {
        System.out.println("Please enter a valid email address!!");
        return;    
        }

        int index = s.indexOf('@');

        String userName = s.substring(0, index);

        System.out.println("Your username is: " + userName);
    }
}