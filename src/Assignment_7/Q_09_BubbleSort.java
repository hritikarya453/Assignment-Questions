package Assignment_7;

import java.util.Scanner;

public class Q_09_BubbleSort {

    public static void bubbleSort(double[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
          boolean  swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

           // stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] arr = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextDouble();
        }

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (double num : arr) {
            System.out.print(num + " ");
        }

        in.close();
    }
}
