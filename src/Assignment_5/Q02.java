package Assignment_5;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if (n1 == sumOfDivisor(n2) && n2 == sumOfDivisor(n1)) {
            System.out.println(n1 + " and " + n2 + " are amicable numbers.");
        } else {
            System.out.println(n1 + " and " + n2 + " are NOT amicable numbers.");
        }
    }

    static int sumOfDivisor(int n) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {  // avoid adding square root twice
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}