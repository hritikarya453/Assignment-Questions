package Semester_1.Assignment3;

import java.util.Scanner;

public class Q09_Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = in.nextDouble();

        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = in.next().charAt(0); // Read operator as character

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
        in.close();
    }
}