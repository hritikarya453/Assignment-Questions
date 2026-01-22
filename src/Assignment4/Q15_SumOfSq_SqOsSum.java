package Assignment4;

import java.util.Scanner;

public class Q15_SumOfSq_SqOsSum {
    public static void main(String[] args) {

        int n = 100;
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;  // 1² + 2² + ... + n²
            sum += i;               // 1 + 2 + ... + n
        }

        int squareOfSum = sum * sum;  // (1 + 2 + ... + n)²
        int difference = squareOfSum - sumOfSquares;

        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Square of sum: " + squareOfSum);
        System.out.println("Difference: " + difference);
    }
}
