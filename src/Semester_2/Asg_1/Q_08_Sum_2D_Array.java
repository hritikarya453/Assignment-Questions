package Semester_2.Asg_1;

import java.util.Scanner;

public class Q_08_Sum_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum =0;

        System.out.print("Enter number of Row and Columns of 2D-Array ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j]= in.nextInt();
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of array elements :" + sum);
    }
}
