package Semester_2.Asg_1;

import java.util.Scanner;

public class Q_07_MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements of Array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxcount = 0;
        int mincount = 0;
        int maxpos = -1;
        int minpos = -1;
        int max = arr[0];
        int min = arr[0];


        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < n ; i++) {
            if (arr[i]== max){
                maxcount++;
                if (maxcount==1){
                    maxpos=i+1;
                }
            }

            if (arr[i]==min){
                mincount++;
                minpos=i+1;
            }
        }
    }
}
