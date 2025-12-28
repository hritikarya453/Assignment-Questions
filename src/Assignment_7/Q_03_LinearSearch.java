package Assignment_7;

import java.util.Scanner;

public class Q_03_LinearSearch {

    // Method to read and store 10 integers into the array
    public static void readArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    // Method to count how many times the searched number appears
    public static int countOccurrences(int[] arr, int key) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                c++;
            }
        }
        return c; // ✅ outside loop
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        readArray(arr);

        System.out.println("Enter the number to search:");
        int target = in.nextInt();

        int oc = countOccurrences(arr, target);

        if (oc == 0) {
            System.out.println("The number " + target + " is not found in the array.");
        } else if (oc == 1) {
            System.out.println("The number " + target + " appears 1 time in the array.");
        } else {
            System.out.println("The number " + target + " appears " + oc + " times in the array.");
        }

        in.close();
    }
}
