package Assignment_5;

import java.util.Scanner;

public class Q01_Twisted_Prime {
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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = in.nextInt();
        int og = n;
        int rev = 0;

        // Reverse the number
        while (n > 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n /= 10;
        }

        // Check twisted prime
        if (isPrime(og) && isPrime(rev)) {
            System.out.println(og + " is a twisted prime number.");
        } else {
            System.out.println(og + " is NOT a twisted prime number.");
        }
    }


}