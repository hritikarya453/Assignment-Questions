package Semester_1.JavaSetPYQ;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if(n<=0){
            System.out.println("Invalid input only positive numbers allowed");
            return;
        }
        switch (n){
            case 1:
                System.out.print(a);
                break;
            case 2:
                System.out.print(a+", "+b);
                break;
            default:
                System.out.print(a+", "+b);
            for (int i = 3; i <= n ; i++) {
                int c = a+b;
                System.out.print(", "+c);
                a=b;
                b=c;
            }
        }
    }
}
