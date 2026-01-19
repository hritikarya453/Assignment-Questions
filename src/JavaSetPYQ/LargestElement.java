package JavaSetPYQ;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part (a) Create an array of n elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Part (b) Input values and set in array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Part (c) Find the largest element
        int largest = arr[0]; // Assume first element is largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
