package Assignment_5;

import java.util.Scanner;

public class Q04_DivCount{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();

        int num = n1;
        int maxDivCount = 0;

        for (int i = n1; i <= n2; i++) {
            int divCount = divisorCount(i);
            if (divCount >= maxDivCount) {
                maxDivCount = divCount;
                num = i;
            }
        }

        System.out.println("The number with the most divisors is " + num);
        System.out.println("Number of divisors: " + maxDivCount);
    }

    // Here not asking for proper divisor only asking for div count
    static int divisorCount(int n) {
        int c = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
                if (i != n / i) {
                    c++;
                }
            }
        }
        return c;
    }
}