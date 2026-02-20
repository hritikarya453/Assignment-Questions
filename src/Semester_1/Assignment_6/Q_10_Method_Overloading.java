package Semester_1.Assignment_6;

import java.util.Scanner;

public class Q_10_Method_Overloading {

    // Area of Square
    public static double area(double side) {
        return side * side;
    }

    // Area of Rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Area of Circle
    public static double area(double radius, boolean circle) {
        return Math.PI * radius * radius;
    }

    // Area of Triangle
    public static double area(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== AREA CALCULATOR (Method Overloading) ===");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            // we can also use case 5 inside switch while returning (return) to while loop 
            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Area of Square: " + area(side));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + area(length, width));
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    System.out.println("Area of Circle: " + area(radius, true));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    System.out.println("Area of Triangle: " + area(base, height, true));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }

        sc.close();
    }
}
