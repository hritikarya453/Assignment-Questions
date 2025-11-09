package Assignment4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        String s = Integer.toString(a);
        String q = s.replace("0","");
        System.out.println(q);
    }
}

