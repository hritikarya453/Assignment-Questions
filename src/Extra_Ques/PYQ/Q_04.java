package Extra_Ques.PYQ;

import java.util.Scanner;

public class Q_04 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = in.nextInt();
        int [] arr = new int[N];
        int profit = 0;

        System.out.println("Enter the prices");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < N-1; i++) {
            if(arr[i]<arr[i+1]){
                profit+=arr[i+1]-arr[i];
            }
        }
        System.out.println("Maximum Profit" + profit);
    }
}
