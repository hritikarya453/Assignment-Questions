package Assignment_6;

import java.util.Scanner;

public class Q_06_Friendly_Pair {

    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }

    public static boolean isFriendlyPair(int a, int b) {
        return  (double) sumOfDivisors(a) / a == (double) sumOfDivisors(b) / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter second number: ");
        int n2 = in.nextInt();

        System.out.println("Sum of proper divisors of " + n1 + " = " + sumOfDivisors(n1));
        System.out.println("Sum of proper divisors of " + n2 + " = " + sumOfDivisors(n2));

        if (isFriendlyPair(n1, n2)) {
            System.out.println(n1 + " and " + n2 + " are a Friendly Pair.");
        } else {
            System.out.println(n1 + " and " + n2 + " are NOT a Friendly Pair.");
        }
    }
}
