import java.util.Scanner;

public class weightConverter2 {
public static void main(String[] args) {
    System.out.print("Weight Converter Program\n 1: Convert lbs to kgs\n 2: Convert kgs to lbs");
    
    double ori_weight, conv_weight;
    byte number;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("\nChoose an option: ");
    number = scan.nextByte();

    if(number == 1){
        System.out.println("Enter the weight in lbs: ");
        ori_weight = scan.nextDouble();

        conv_weight = 0.453592*ori_weight;

        System.out.printf("The new weight in kgs is: %.2f",conv_weight);
    }
    else if(number == 2){
         System.out.println("Enter the weight in kgs: ");
        ori_weight = scan.nextDouble();

        conv_weight = 2.2046*ori_weight;

        System.err.printf("The new weight in lbs is: %.2f",conv_weight);
    }
    else{
        System.out.println("Choose one of given options!!");
    }
    
    scan.close();
}
}