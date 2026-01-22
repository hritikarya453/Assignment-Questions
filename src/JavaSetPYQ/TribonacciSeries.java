package JavaSetPYQ;

import java.util.Scanner;

public class TribonacciSeries {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        if(n<=3){
            System.out.println("Invalid Input Return");
        }
        int a=0;
        int b=1;
        int c=2;
        System.out.print(a+" "+b+" "+c);
        for (int i = 4; i <=n ; i++) {

            int d = a+b+c;
            System.out.print(" "+d);
            a=b;
            b=c;
            c=d;
        }
        System.out.println();
    }
}
