import java.util.Scanner;
public class hollowSquarePattern{
    public static void main(String[] args) {
        /* 
        1 1 1 1 1
        1       1
        1       1
        1       1
        1 1 1 1 1
        for  n = 5
        */
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
       

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("1 ");
                }
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}