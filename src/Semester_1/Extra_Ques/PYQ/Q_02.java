package Semester_1.Extra_Ques.PYQ;

import java.util.Scanner;

public class Q_02 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = in.nextInt();
        int[] arr = new int[N];
        int sum=0;

        System.out.println("Enter the amount of money in each coach");
        for (int i = 0; i < N; i++) {
            arr[i]=in.nextInt();
            if(i%2==0){
                sum+=arr[i];
            }
        }

        System.out.println("Robber can get max ="+sum);
    }
}
