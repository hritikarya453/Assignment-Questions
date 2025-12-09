package Assignment_6;

import java.util.Scanner;

public class Q_10_Method_Overloading {
    public static int area(int s) {
        return s * s;
    }
    public static int area(int l, int b) {
        return l * b;
    }
    public static double area(double r) {
        return Math.PI*r*r;
    }
    public static double area(double h, double b) {
        return 0.5*h* b;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("\n=== AREA CALCULATOR (Method Overloading) ===");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");



        }

    }
}