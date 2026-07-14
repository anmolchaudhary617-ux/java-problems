import java.util.Scanner;
public class smartPatternGenerator {
public static void main(String[] args){
//1
//12
//123
//1234
//12345
//1234
//123
//12  
//1
// 1 2 3 4 5 6 7 8 9    
// 1 2 3 4 5 4 3 2 1
// 1 12 123 1234 12345 1234 123 12 1  
    int count = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n =  sc.nextInt();

    for (int i = 1; i <= (2 * n - 1); i++){
        int limit = i <= n ? i : (2 * n - i);
        for(int j = 1; j <= limit ; j++){
            System.out.print(j);
            count++;
        }
        System.out.println();
    }

    boolean isEvenVariable = isEven(count);

    String printOddOrEven = isEvenVariable ? "Even" : "Odd";

    System.out.print("Total numbers printed: " + count + " -> which is " + printOddOrEven);
    }

    static boolean isEven(int count){
        return count % 2 == 0;
    }
}