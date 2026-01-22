//Write a Java Program to print the following output using for loop. Where, input is the
//number of rows in output pattern.
//
//For input, N = 4.
//1
//121
//1213121
//121312141213121

package Assignment4;

import java.util.Scanner;

public class Q02_s_i_s {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = in.nextInt();
        String s = "";
        for (int i = 1; i <=n ; i++) {
            s = s+i+s;
            System.out.println(s);
        }
    }
}
