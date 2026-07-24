import java.util.Scanner;

public class StringProblem2{
    public static void main(String[] args) {
        // Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ 
        // in the original string with letter 'i'
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with a 'e' in it: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'e'){
                sb.setCharAt(i, 'i');
            }
        }
 
        String result = sb.toString();
        System.out.println(result);
    }
}