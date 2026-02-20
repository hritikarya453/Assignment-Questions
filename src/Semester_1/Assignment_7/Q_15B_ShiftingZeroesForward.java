package Semester_1.Assignment_7;

import java.util.Scanner;

public class Q_15B_ShiftingZeroesForward {
    public static void moveZerosToBeginning(int[] arr) {
        int[] temp = new int[arr.length];
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==0){
                temp[index]=0;
                index++;
            }
        }
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= temp[i];
        }
    }

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
