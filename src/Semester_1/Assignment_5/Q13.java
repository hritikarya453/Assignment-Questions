package Semester_1.Assignment_5;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x in radians: ");
        double x = sc.nextDouble();

        double term = x;
        double sum = x;
        int n = 1;

        while (Math.abs(term) > 1e-6) { // acceptable error 10^-6
            term = Math.pow(-1, n) * Math.pow(x, (2 * n) + 1) / factorial((2 * n) + 1);
            sum += term;
            n++;
        }

        System.out.println("sin(" + x + ") ≈ " + sum);
        System.out.println("Math.sin(" + x + ") = " + Math.sin(x)); // compare with built-in
    }

    // factorial method
    public static long factorial(int num) {
        if(num==0|| num==1)
            return 1;
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}