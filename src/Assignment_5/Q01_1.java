package Assignment_5;

import java.util.Scanner;

public class Q01_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = in.nextInt();
        // Call reverse method
        int rev = reverseNumber(n);

        // Check twisted prime
        if (isPrime(n) && isPrime(rev)) {
            System.out.println(n + " is a twisted prime number.");
        } else {
            System.out.println(n + " is NOT a twisted prime number.");
        }
    }

    // Method to reverse a number
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n /= 10;
        }
        return rev;
    }

    // Method to check prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}