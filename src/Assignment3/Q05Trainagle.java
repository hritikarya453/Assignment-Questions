package Assignment3;

import java.util.Scanner;

public class Q05Trainagle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three sides
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Check triangle validity using triangle inequality rule
        if (a + b > c && b + c > a && c + a > b) {
            // Valid triangle
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || c == a) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            // Invalid triangle
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}