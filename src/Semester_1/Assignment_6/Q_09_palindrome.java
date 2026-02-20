package Semester_1.Assignment_6;

import java.util.Scanner;

public class Q_09_palindrome {

    public static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is Not a Palindrome.");
        }
    }
}
