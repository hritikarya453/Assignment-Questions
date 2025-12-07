package Assignment_5;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        // Loop through terms
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(-1, i + 1) * (2.0 * i / (2.0 * i - 1));
            sum += term;
        }

        System.out.println("Sum = " + sum);
    }
}

