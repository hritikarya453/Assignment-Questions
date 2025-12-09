package Assignment_6;

import java.util.Scanner;

public class Q_01_SimpleCalculator {

    public static int additionSimple(int x, int y) {
        return x + y;
    }
    public static int subtractionSimple(int x, int y) {
        return y - x;
    }
    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }
    public static double divisionSimple(int x, int y) {
        if (x == 0) {
            System.out.println("Error: Division by zero not allowed!");
            return 0;
        }
        return (double) y / x;
    }
    public static int remainderSimple(int n, int m) {
        return n % m;
    }
    public static double squareRootSimple(int n) {
        if (n < 0) {
            System.out.println("Error: Square root of negative number not possible!");
            return 0;
        }
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            int x = 0, y = 0, n = 0;

            if (ch == 7) {
                System.out.println("Exiting Calculator...");
                break;
            }
            else if (ch == 6) {
                System.out.print("Enter a number: ");
                n = sc.nextInt();
                System.out.println("Result: " + squareRootSimple(n));
            }
            else if (ch >= 1 && ch <= 5) {
                System.out.print("Enter first number: ");
                x = sc.nextInt();
                System.out.print("Enter second number: ");
                y = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Result: " + additionSimple(x, y));
                        break;
                    case 2:
                        System.out.println("Result: " + subtractionSimple(x, y));
                        break;
                    case 3:
                        System.out.println("Result: " + multiplicationSimple(x, y));
                        break;
                    case 4:
                        System.out.println("Result: " + divisionSimple(x, y));
                        break;
                    case 5:
                        System.out.println("Result: " + remainderSimple(x, y));
                        break;
                }
            } else {
                System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}
