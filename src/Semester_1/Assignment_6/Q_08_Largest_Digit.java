package Semester_1.Assignment_6;

import java.util.Scanner;public class Q_08_Largest_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        System.out.println("Largest digit: " + largestDigit(n));
    }

    public static int largestDigit(int n) {
        int ld = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > ld) {
                ld = digit;
            }
            n /= 10;
        }
        return ld;
    }
}
