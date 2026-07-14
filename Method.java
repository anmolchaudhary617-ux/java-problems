import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        /*
        calculate(int a, int b)	-> Return the sum of a and b
        calculate(double a, double b) -> Return the product of a and b
        calculate(int a)	Return the -> square of a
        1 → Sum of two integers
        2 → Product of two doubles
        3 → Square of an integer
        */

        Scanner scanner = new Scanner(System.in);

        int option;

        System.out.println("1 -> Sum of two integers");
        System.out.println("2 -> Product of two doubles");
        System.out.println("3 -> Square of an integer");

        System.out.print("Choose one of the above options and \nEnter the number written in front of it to give corresponding Inputs: ");
        option = scanner.nextInt();

        if(option == 1){
            int a, b;
            System.out.print("Enter two numbers for their sum: ");
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.printf(" %d + %d = %d",a,b,calculate(a, b));
        }
        else if(option == 2){
            double a, b;
            System.out.print("Enter two numbers for their product: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();

            System.out.printf("\n %.2f x %.2f = %.2f",a,b,calculate(a, b));
        }

        else if(option == 3){
            int a;
            System.out.print("Enter a number to get the square of it: ");    
            a = scanner.nextInt();

            System.out.printf("\n %d² = %d", a, calculate(a));
        }
        
        else{
            System.out.println("Please enter a number from above written options!!");
        }
        scanner.close();
    }

    static int calculate (int a, int b){
        return a + b;
    }

    static double calculate (double a, double b){
        return a * b;
    }
    static int calculate (int a){
        return a * a;
    }
}
