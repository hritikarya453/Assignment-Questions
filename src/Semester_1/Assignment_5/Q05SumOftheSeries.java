package Semester_1.Assignment_5;

import java.util.Scanner;

public class Q05SumOftheSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total=0;
        for (int i = 1; i <=n ; i++) {
            int sum=0;
            for (int j = 1; j <=i ; j++) {
                sum+=j;
            }
            total+=sum;
        }
        System.out.println("Sum of the series :" + total);
    }
}
