package Semester_2.Asg_1;

import java.util.Scanner;

public class Q_03_Spy_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int prod = 1;
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int og = n;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }

        System.out.println((sum==prod)
                ?og+"is a spy number"
                :og+"is not a spy number");

    }
}
