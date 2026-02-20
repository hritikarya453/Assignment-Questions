package Semester_1.Assignment_5;

import java.util.Scanner;

public class Q14_a {

    static int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle in radians
        System.out.print("Enter value of x (in radians): ");
        double x = sc.nextDouble();

        // Input number of terms
        System.out.print("Enter number of terms in series: ");
        int n = sc.nextInt();

        double sum = 0.0;

        // Compute cosine using series expansion
        for (int i = 0; i < n;i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
            sum += term;
        }

        System.out.println("Approximate value of cos(" + x + ") using " + n + " terms = " + sum);
        System.out.println("Java Math.cos(" + x + ") = " + Math.cos(x)); // For comparison

        sc.close();
    }
}
