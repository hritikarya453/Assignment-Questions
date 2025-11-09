//Write a Java Program that gets three integer numbers from the user. Count from the
//first number to the second number increments by the third number.  Use for loop to do
//it.
//
//Also, display the sum of numbers displayed between the first number and second
//number.



package Assignment4;

import java.util.Scanner;

public class Q05 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = in.nextInt();
        System.out.println("Enter second number");
        int b = in.nextInt();
        System.out.println("Enter third number");
        int c = in.nextInt();
        String s=" ";
        for (int i = a; i <=b ; i=i+c) {
            System.out.print(s+i);
        }

    }
}
