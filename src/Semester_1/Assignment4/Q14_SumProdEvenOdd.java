package Semester_1.Assignment4;

import java.util.Scanner;

public class Q14_SumProdEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int sum = 0;     // Sum of even numbers
        int prod = 1;    // Product of odd numbers

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                prod *= i;
            }
        }


        System.out.println("Sum of all even numbers = " + sum);
        System.out.println("Product of all odd numbers = " + prod);
    }
}