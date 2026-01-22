package Assignment_7;

import java.util.Scanner;

public class Q_10Eliminate_Duplicates {
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index] = list[i];
                index++;
            }
        }

        // Create final array of exact size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = eliminateDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }

}
