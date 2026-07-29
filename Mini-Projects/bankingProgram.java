import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {
        /*
        * ===== BANKING MENU =====
        * 1. Check Balance
        * 2. Deposit Money
        * 3. Withdraw Money
        * 4. Exit
        * =======================
        * 
        */

        int balance = 0;
        
        Scanner scan = new Scanner(System.in);


        OUTER:
        while (true) {
            printMenu();
            int userChoice;
            System.out.print("\nEnter your choice (1-4): ");
            userChoice = scan.nextInt();
            switch (userChoice) {
                case 1 -> checkBalance(balance);
                case 2 -> amounttoDeposit(balance);
                case 3 -> amounttoWithdraw(balance);
                case 4 -> {
                    System.out.println("Thank you for using the banking program!");
                    break OUTER;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
}
static void printMenu(){
    for(int i = 0; i < 15; i++){
            System.out.print("*");
       }

       System.out.print("\nBANKING PROGRAM\n");
       for(int i = 0; i < 15; i++){

            System.out.print("*");
       }

       System.out.println("\n1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Exit");

        for(int i = 0; i < 15; i++){
            System.out.print("*");
       }
}

static void printLine(){
    for(int i = 0; i < 15; i++){
            System.out.print("*");
       }
    }

    static void checkBalance(int balance){
    System.out.println( "Available Balance: $ " + balance);
    printLine();
}

static int amounttoDeposit(int balance){
        Scanner scanner = new Scanner(System.in);
        int amountDeposit;
        System.out.print("Enter amount to be deposited: ");
        amountDeposit = scanner.nextInt();
        balance += amountDeposit;
        printLine();
        return amountDeposit;
}

    @SuppressWarnings("UnusedAssignment")
    static int amounttoWithdraw(int balance){
        Scanner scanner = new Scanner(System.in);
        int amountWithdraw;
        System.out.print("Enter amount to be withdrawn: ");
        amountWithdraw = scanner.nextInt();
        if(balance >= amountWithdraw){
            balance -= amountWithdraw;
            }
            else{
            System.out.println("Balance LOW! Cannot withdraw!!");
            }
        printLine();
        return amountWithdraw;
}
}    