package Semester_1.Assignment4;

import java.util.Scanner;

public class Q10amw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        String s = String.valueOf(n);
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') // ✅ compare with character '0'
                continue;
            res += s.charAt(i); // append non-zero digits
        }

        System.out.println("After removing zeroes: " + res);
    }
}