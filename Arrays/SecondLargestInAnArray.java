import java.util.Scanner;

@SuppressWarnings("resource")
public class SecondLargestInAnArray {
    public static void main(String[] args) {
        /*
         * Given an integer array arr of size n, find the second
         * largest distinct element in the array.
         */
        Scanner scan = new Scanner(System.in);

        int n;
        int[] arr;

        System.out.print("Enter the number of elements that you want to store in a 1D array: ");
        n = scan.nextInt();

        arr = new int[n];

        System.out.println("Now, enter elements to add in the array(let it be arr)->");

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = scan.nextInt();
        }

        System.out.println("You entered the following array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

        int largest, secondLargest;

        largest = secondLargest = Integer.MIN_VALUE;
        

        // 3 2 5 4 5

        for(int i = 0; i < n; i++){
           if(largest < arr[i]){
            secondLargest = largest;
            largest = arr[i];
           }
           else if(largest > arr[i] && secondLargest < arr[i]){
            secondLargest = arr[i];
           }
        }

        if(n < 2){
            System.out.println("\nArray should have at least 2 elements to find the second largest distinct element.");
        }
        else if(largest > secondLargest){
            System.out.println("\nIn the above array, " + secondLargest + " is the second largest distinct element.");
        }
        else{
            System.out.println("\nThere is no second largest distinct element in the array.");
        }   
    }
}