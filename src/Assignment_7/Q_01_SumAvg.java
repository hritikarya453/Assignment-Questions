package Assignment_7;

import java.util.Scanner;

public class Q_01_SumAvg {

    public static int findSum(int[] arr) {
        int sum = 0;
        for(int e : arr){
            sum+=e;
        }
        return sum;
    }

    public static double findAverage(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.print("Array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = (int)(Math.random() * 101);
            System.out.print(arr[i] + " ");
        }

        // Calling methods // Storing in variables
        int sum = findSum(arr);
        double avg = findAverage(arr);

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
