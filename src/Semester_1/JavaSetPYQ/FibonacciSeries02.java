package Semester_1.JavaSetPYQ;

// here we compute 2 terms per iteration

import java.util.Scanner;

public class FibonacciSeries02 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        if(n<=0){
            System.out.println("Invalid Input! Only postive numbers are allowed");
            return;
        }
        int a = 0;
        int b = 1;
        switch (n){
            case 1:
                System.out.print(a);
                break;
            case 2:
                System.out.print(a+", "+b);
                break;
            default:
                System.out.print(a+", "+b);
                for (int i = 3; i <= n; i += 2) {
                    int c = a + b;
                    System.out.print(", " + c);

                    if (i + 1 <= n) {
                        int d = b + c;
                        System.out.print(", " + d);

                        a = c;
                        b = d;
                    }
                }

        }

    }
}
