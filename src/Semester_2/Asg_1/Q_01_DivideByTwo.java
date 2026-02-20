package Semester_2.Asg_1;

import java.util.Scanner;

public class Q_01_DivideByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 2: ");
        int num = sc.nextInt();

        int count = 0;

        while (num >= 2) {
            num = num / 2;
            count++;
        }

        System.out.println("Number of times divided by 2 before value becomes less than 2: " + count);

        sc.close();
    }
}
