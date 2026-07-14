import java.util.Scanner;
public class checkifArrayisSorted {
    public static void main(String[] args) {
        /*
        Given an integer array arr of size n, check whether the array is sorted in non-decreasing order.

        Non-decreasing means:
        arr[i] <= arr[i+1]
        */
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = scan.nextInt();

        int[] arr = new int[size];

        System.out.print("(Let the array be \"arr\")\n");

        for(int i = 0; i < size; i++){
            System.out.printf("arr[%d] = ",i);
            arr[i] = scan.nextInt();
        }

        System.out.println("You entered the following Array: ");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        boolean isSorted = checkIfArrayIsSorted(arr, size);

        if(isSorted){
            System.out.println("\nYes, the array is sorted in non-decreasing order.");
        } else {
            System.out.println("\nNo, the array is not sorted in non-decreasing order.");
        }

        scan.close();
    }

    public static boolean checkIfArrayIsSorted(int[] arr, int size) {
        for(int i = 0; i < size - 1; i++){
            if(arr[i] > arr[i+1] || arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }
}