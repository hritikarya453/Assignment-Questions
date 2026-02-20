package Semester_1.Assignment3;

import java.util.Scanner;

public class Q12_LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // (a) Using nested if–else
        int largest1;
        if (a >= b) {
            if (a >= c) {
                largest1 = a;
            } else {
                largest1 = c;
            }
        } else {
            if (b >= c) {
                largest1 = b;
            } else {
                largest1 = c;
            }
        }

        // (b) Using if–else if ladder
        int largest2;
        if (a >= b && a >= c) {
            largest2 = a;
        } else if (b >= a && b >= c) {
            largest2 = b;
        } else {
            largest2 = c;
        }

        // (c) Using conditional (ternary) operator
        int largest3 = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        // Output
        System.out.println("Largest number (Nested if–else): " + largest1);
        System.out.println("Largest number (if–else if ladder): " + largest2);
        System.out.println("Largest number (Ternary operator): " + largest3);
    }
}
