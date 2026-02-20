package Semester_1.Assignment_6;

import java.util.Scanner;

public class Q_04_Regular_Polydon_Area {
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();

        System.out.print("Enter length of each side: ");
        double side = sc.nextDouble();

        double result = area(n, side);

        System.out.println("Area of the regular polygon: " + result);
    }
}
