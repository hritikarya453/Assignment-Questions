package Assignment_5;

import java.util.Scanner;

public class Q03_StrongNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);   // call factorial method
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is NOT a Strong number.");
        }

        sc.close();
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
