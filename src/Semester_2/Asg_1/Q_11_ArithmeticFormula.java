package Semester_2.Asg_1;

import java.util.Scanner;

public class Q_11_ArithmeticFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (a + b == c) {
            System.out.println("Valid formula: a + b = c");
        } else if (a == b - c) {
            System.out.println("Valid formula: a = b - c");
        } else if (a * b == c) {
            System.out.println("Valid formula: a * b = c");
        } else {
            System.out.println("No valid arithmetic formula found");
        }

        sc.close();
    }
}


