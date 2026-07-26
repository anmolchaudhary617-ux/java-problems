import java.util.Scanner;

public class ShoppingCart {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        /*
         * This is a shopping cart program which gives you the final total price
         * and quantity of items that you are going to buy
         */
        Scanner scan = new Scanner(System.in);

        double item_price;
        String item;
        int item_quantity;

        System.out.print("What item would you like to buy: ");
        item = scan.nextLine();

        System.out.print("What is the price of each item?:(in $) ");
        item_price = scan.nextDouble();

        System.out.print("How many items would you like?: ");
        item_quantity = scan.nextInt();

        if (item_quantity == 1) {
            System.out.println("\nYou have bought " + item_quantity + " " + item);
        } else {
            System.out.print("\nYou have bought " + item_quantity + " " + item + "s");
        }

        System.out.println("""
                           Your total is $""" + item_quantity * item_price);

        scan.close();
    }
}
