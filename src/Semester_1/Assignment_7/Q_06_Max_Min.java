package Semester_1.Assignment_7;

import java.util.Scanner;

public class Q_06_Max_Min {

    public static void readArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // DO NOT close Scanner here
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int countOccurrences(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    public static int firstPositionOfMax(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                return i + 1;
        }
        return -1;
    }

    public static int lastPositionOfMin(int[] arr, int min) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        readArray(arr);

        int max = findMax(arr);
        int min = findMin(arr);

        System.out.println("\nMaximum value: " + max);
        System.out.println("It occurs " + countOccurrences(arr, max) + " time(s)");
        System.out.println("First position of maximum: " + firstPositionOfMax(arr, max));

        System.out.println("\nMinimum value: " + min);
        System.out.println("It occurs " + countOccurrences(arr, min) + " time(s)");
        System.out.println("Last position of minimum: " + lastPositionOfMin(arr, min));

        in.close();
    }
}
//Instead of taking another Scanner we can simply pass Scanner to the method
//public static void readArray(int[] arr, Scanner in) {
//    for (int i = 0; i < arr.length; i++) {
//        arr[i] = in.nextInt();
//    }
//}
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//
//    readArray(arr, in);
//
//    in.close(); // close only here
//}
