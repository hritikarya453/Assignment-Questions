package Assignment_5;

import java.util.Scanner;

public class Q06 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum= 0;
        for (int i = 1; i <= n; i++) {
          sum+=(i*(i+1))/2;
        }
        System.out.println(sum);
    }
}
