//Write a Java Program that takes an integer as input and reverses its digits using a
//while loop.
//After reversing, the program should check whether the number is a palindrome.
//
//A palindrome number is one that remains the same when its digits are reversed.
//For example, 121 and 1221 are palindrome numbers, but 123 is not.


package Assignment4;

import java.util.Scanner;

public class Q06Palindrome {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        int og=n;
        int rev=0;
        while (n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        System.out.println("Reverse of a number "+rev);
        if (og==rev)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");

    }

}
