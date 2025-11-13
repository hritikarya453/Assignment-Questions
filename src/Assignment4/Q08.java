package Assignment4;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = in.nextInt();
        int b = in.nextInt();
        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Gcd =" + b);
    }
}

/*
package Assignment4;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        // Euclidean algorithm (efficient method)
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " is: " + x);
    }
}

 */