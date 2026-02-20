package Semester_1.Assignment_5;

import java.util.Scanner;

public class Q06Series {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        double sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=1/Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
