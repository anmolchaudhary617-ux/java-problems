import  java.util.Scanner;
public class smartPatternGenerator2{
public static void main() {
    /*
    1         1
    12        12
    123       123
    1234      1234
    12345     123
    1234      12
    123       1
    12
    1
    1   2   3    4     5
    1  12 123 1234 12345


    */
    int count = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
            count++;
        }
        System.out.println();
    }

    for(int i = 1; i <= n - 1; i++){
        for(int j = 1; j <= (n - i); j++){
            System.out.print(j);
            count++;
        }
        System.out.println();
    }

    if (count % 2 == 0) {
    System.out.println("Total numbers printed: " + count + " -> which is EVEN");    
    }
    else
    System.out.println("Total numbers printed: " + count + " -> which is ODD");
}
}
