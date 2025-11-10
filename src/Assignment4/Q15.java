package Assignment4;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sum=0, sq=0;
        for (int i = 1; i <=100 ; i++) {
            sum += i*i;
            sq+=i;
        }
        System.out.println("Sum of sq : "+ sum);
        System.out.println("Square of sum : "+ (int)Math.pow(sq,2));
    }
}
