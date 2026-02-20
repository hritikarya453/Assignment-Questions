package Semester_1.Assignment3;

import java.util.Scanner;

public class Q03IncDec{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        System.out.print("Input third number: ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("\"Neither increasing nor decreasing\"");
        }
        sc.close();
    }
}
