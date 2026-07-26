import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * In this program, I will try to give the solutions of a quadratic equation
         * using a quadratic formula, which is:
         * a,b(solutions of yx² + zx + w ) = {-z +- sqrt(z² - 4yw)}/2y
         */
        double a, b, c, x, y;
        double Discriminant;
        System.out.print("Consider a quadratic equation as follows: \n ax² + bx + c\n");

        System.out.print(
                "Give the values of a, b and c(integer) to get the two solutions of the corresponding quadratic equation if they exist. \n");

        System.out.print("a: ");
        a = scan.nextDouble();

        System.out.print("b: ");
        b = scan.nextDouble();

        System.out.print("c: ");
        c = scan.nextDouble();

        if (a == 0) {
            System.out.println("Here, you gave a = 0, due to which the equation becomes a non-quadratic equation!! 😡");
        }
        else{

        Discriminant = (Math.pow(b, 2) - 4 * a * c);

        System.out
                .println(" The Discriminant of the quadratic equation formed by the given values is : " + Discriminant);

        if (Discriminant > 0) {
            x = (-b + Math.sqrt(Discriminant))/ (2*a);

            y = (-b - Math.sqrt(Discriminant))/ (2*a);

            System.out.println(
                    "Now, let the soltuions be x and y as the solutions will be real and distinct in this case.");

            System.out.println("So, x = " + x + " and y = " + y);
        }
        else if(Discriminant == 0){
             x = (-b + Math.sqrt(Discriminant))/ (2*a);

            System.out.println(
                    "In this case, the solutions of the equation will be real but equal.");

            System.out.println("So, x = y = " + x);
        }
        else{
            System.out.println("The solutions are not REAL for this case.");
        }
    }

        scan.close();
    }
}
