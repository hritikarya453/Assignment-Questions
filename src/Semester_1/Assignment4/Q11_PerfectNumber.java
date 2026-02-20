package Semester_1.Assignment4;

import java.util.Scanner;

public class Q11_PerfectNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Perfect number is defined only for positive integers.");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }

        in.close();
    }
}
