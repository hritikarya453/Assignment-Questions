package Assignment_6;

import java.util.Scanner;

public class Q_15_Palindrome_String {

    public static boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.next();   // reads a single word // for palindrome

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
