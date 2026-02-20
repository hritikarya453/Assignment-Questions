package Semester_1.Assignment_7;

import java.util.Scanner;

public class Q_15_ShiftingZeroesForward {

    // Method to move all zeros to the beginning
    public static void moveZerosToBeginning(int[] arr) {
        int index = arr.length - 1;

        // Move non-zero elements to the end (right side)
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        // Fill remaining positions with zeros
        while (index >= 0) {
            arr[index--] = 0;

        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        moveZerosToBeginning(arr);

        System.out.println("After moving all zeros to the beginning:");
        printArray(arr);

        sc.close();
    }
}
