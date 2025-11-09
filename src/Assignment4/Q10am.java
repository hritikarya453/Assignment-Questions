package Assignment4;

import java.util.Scanner;

public class Q10am {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int m=n;
        int place = 1;
        int sum = 0;
        int s2=0;
        while (n != 0) {
            int digit = n % 10;
            if (digit != 0) {
                sum += digit * place;
                place *= 10;
            }
            n/=10;
        }
        System.out.println(sum);
        while(m!=0){
            int rem = m%10;
            s2=s2*10+rem;
            m/=10;
        }
        System.out.println("Reverse of a number "+s2);
    }
}
