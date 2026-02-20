package Semester_1.Assignment_6;

import java.util.Scanner;

public class Q_18_VolumeCalculator {

    // Volume of Cube
    public static double volume(int side) {
        return Math.pow(side, 3);
    }

    // Volume of Cuboid
    public static double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Volume of Cylinder
    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Volume Calculator ---");
            System.out.println("1. Volume of Cube");
            System.out.println("2. Volume of Cuboid");
            System.out.println("3. Volume of Sphere");
            System.out.println("4. Volume of Cylinder");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter side: ");
                    int side = in.nextInt();
                    System.out.println("Volume of Cube = " + volume(side));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = in.nextDouble();
                    System.out.print("Enter width: ");
                    double w = in.nextDouble();
                    System.out.print("Enter height: ");
                    double h = in.nextDouble();
                    System.out.println("Volume of Cuboid = " + volume(l, w, h));
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    double r1 = in.nextDouble();
                    System.out.println("Volume of Sphere = " + volume(r1));
                    break;

                case 4:
                    System.out.print("Enter radius: ");
                    double r2 = in.nextDouble();
                    System.out.print("Enter height: ");
                    double h2 = in.nextDouble();
                    System.out.println("Volume of Cylinder = " + volume(r2, h2));
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
