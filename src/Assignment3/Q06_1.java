
package Assignment3;

import java.util.Scanner;

public class Q06_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.printf("The equation has two roots %.6f and %.6f\n", r1, r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.printf("The equation has one root %.0f\n", r);
        } else {
            System.out.println("The equation has no real roots");
        }

        in.close();
    }
}