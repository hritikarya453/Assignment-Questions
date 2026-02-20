package Semester_2.Asg_1;

import java.util.Scanner;

public class Q_06_OddCheck {

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + " is odd: " + isOdd(n));
    }
}
