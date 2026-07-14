import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
    // Question: There are n numbers check if each of them are prime or not and provide result accordingly.
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("How many numbers do you want to check?: ");
        n = sc.nextInt();

        for(int x = 1; x <= n; x++){
            int num;
            System.out.print("Enter number " + x + ": ");
            num = sc.nextInt();
            int result = checkIfPrime(num);

            if(result == 1)
                System.out.println(num + " is a prime number!");
            else
                System.out.println(num + " is not a prime number!");
        }
    }

   static int checkIfPrime(int num){
        int remainder = 0;
        if(num <= 1){
            return 0;
        }
        else if (num == 2){
          return 1;
        }
        else {
          for(int a = 2; a <= num /2; a++ ){
              remainder = num % a;

              if(remainder == 0){
                  return 0;
              }
              else
                  return 1;
          }
        }
    }
}

