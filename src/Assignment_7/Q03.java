package Assignment_7;

import java.util.Scanner;

public class Q03 {
    // 1. A method to read and store the 10 integers into the array:
    public static void readArray(int[] arr){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
    }

// 2. A method to count how many times the searched number appears in the array:
    public static int countOccurrences(int[] arr, int key){
        int c = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                c++;
            }
        }
        return c;
    }
   public static void main(String[] args) {
        int[] arr = new int[10];
        readArray(arr);
       System.out.println("Ther no of time ");
    }
}
