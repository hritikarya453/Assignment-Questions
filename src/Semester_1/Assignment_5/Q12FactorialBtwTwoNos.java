package Semester_1.Assignment_5;

import java.util.Scanner;

public class Q12FactorialBtwTwoNos {

    // Method to calculate factorial
    static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = in.nextInt();

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        // Input validation
        if (m <= 0 || n <= 0 || m >= n) {
            System.out.println("Invalid input! Ensure m < n and both > 0.");
            return;
        }

        System.out.println("Factorials between " + m + " and " + n + " are:");

        for (int i = m ; i <= n; i++) {
            System.out.println("Factorial of " + i + " is: " + factorial(i));
        }

    }
}
