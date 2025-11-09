//Write a Java Program to check whether a number is divisible by 9. Use while loop.
//
//Rule: An integer n is divisible by 9 if the sum of its digits is divisible by 9.  Use this
//concept in your program to determine whether or not the number is divisible by 9.
//
//Test it on the following numbers:
//n = 123456
//n = 154368
//n = 621594

package Assignment4;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = in.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        if (sum%9==0){
            System.out.println("IT is divisible by 9");
        }else{
            System.out.println("It is not divsible by 9");
        }

    }
}
