package Assignment4;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all multiples of 3 or 5 below " + n + " is: " + sum);
        in.close();
    }
}