package Asg_2_P1;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer btw 0 to 1000");
        int a = in.nextInt();

        if (a < 0 || a > 1000) {
            System.out.println("Please enter only number btw 0 to 1000");
            return;
        }

        int s = 0;
        while (a > 0) {
            int b = a % 10;
            s += b;
            a = a / 10;
        }

        System.out.println("Sum of digits:\n " + s);
    }
}