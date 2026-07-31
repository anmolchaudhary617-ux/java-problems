import java.util.Scanner;
public class CheckIfPrime {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
    // Question: There are n numbers check if each of them are prime or not and provide result accordingly.
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("How many numbers do you want to check?: ");
        n = sc.nextInt();

        for(int x = 1; x <= n; x++){
            System.out.print("Enter number " + x + ": ");
            int num = sc.nextInt();
            boolean result = checkIfPrime(num);
            if (result) {
                System.out.println(num + " is a Prime number");
            }
            else{
                System.out.println(num + " is not a Prime number");
            }
        }
        sc.close();
    }

   static boolean checkIfPrime(int num){
       if (num < 0) {
           System.out.println("Please Enter a Positve number!");
           return false;
       }
       else if (num == 0) {
           System.out.println("0 is neither Prime nor Composite!");
           return false;
       }
       else if (num == 1) {
           return false;
       }
       else{
       for(int i = 2; i < num / 2; i++)
            if(num % i == 0){
                return false;
            }
       }
       return true;
    }
}