package Assignment_7;

import java.util.Scanner;

public class Q_07_RotateArrayClockwise {
    //REMEMBER PASSING SCANNER TO METHOD IS BETTER
    public static void readArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to rotate array elements clockwise by one position (in-place)
    public static void rotateClockwise(int[] arr) {
      //  for (int j = 0; j < 3; j++) {

            int last = arr[arr.length - 1];   // store last element

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;   // place last element at first position
       // }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        readArray(arr);
//        System.out.println("How many time you want to rotate");
//        int n =3;
//        for (int i = 0; i < n ; i++) {
//            rotateClockwise(arr);
//        }
        rotateClockwise(arr);
        System.out.println("Array after clockwise rotation by one position:");
        printArray(arr);
    }
}
