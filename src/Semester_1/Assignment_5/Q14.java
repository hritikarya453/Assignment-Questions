package Semester_1.Assignment_5;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x in radians: ");
        double x = sc.nextDouble();

        double term = 1;   // first term
        double sum = 1;    // initialize sum with first term
        int i = 1;

        // keep adding terms until they are very small
        while (Math.abs(term) > 1e-6) {
            term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
            sum += term;
            i++;
        }

        System.out.println("Approximate value of cos(" + x + ") = " + sum);
        System.out.println("Math.cos(" + x + ") = " + Math.cos(x));

        sc.close();
    }

    // factorial method
    public static double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}