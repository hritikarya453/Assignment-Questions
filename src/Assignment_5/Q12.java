package Assignment_5;


import java.util.Scanner;

public class Q12 {
    // Recursive method to calculate factorial
    static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;  // base case
        }
        return num * factorial(num - 1);  // recursive case
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = in.nextInt();

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        // Validate input
        if (m <= 0 || n <= 0 || m >= n) {
            System.out.println("Invalid input! Ensure m < n and both > 0.");
            return;
        }

        // Display factorials between m and n
        for (int i = m; i <= n; i++) {
            System.out.println("Factorial of " + i + " is: " + factorial(i));
        }
    }
}

