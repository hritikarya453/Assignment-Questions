package Semester_1.JavaSetPYQ;

import java.util.Scanner;

public class PrimePalindrome {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int original = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter starting point: ");
        int start = in.nextInt();
        if (start < 2) start = 2;

        int count = 0;

        while (count < 100) {
            if (isPrime(start) && !isPalindrome(start)) {
                System.out.print(start + " ");
                count++;

                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            start++;
        }
    }
}
