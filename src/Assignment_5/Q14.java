package Assignment_5;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x in radians: ");
        double x = sc.nextDouble();

        double term = 1; // first term
        double sum = 1;  // start sum from 1
        int n = 1;

        while (Math.abs(term) > 1e-6) { // acceptable error 10^-6
            term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
            sum += term;
            n++;
        }

        System.out.println("Cos(" + x + ") = " + sum);
    }

    // factorial method
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
