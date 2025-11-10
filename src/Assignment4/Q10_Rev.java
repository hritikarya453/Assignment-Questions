package Assignment4;

import java.util.Scanner;

public class Q10_Rev {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = in.nextInt();
       int sum = 0;
       while (n!=0){
           int r=n%10;
           if(r!=0){
               sum=sum*10+r;
           }
           n=n/10;
       }
       System.out.println(sum);
    }
}
