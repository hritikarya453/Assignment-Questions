package Assignment_6;

import java.util.Scanner;

public class Q_17_MiddleCharacter {

    public static char getMiddleCharacter(String str) {
        int len = str.length();

        // Middle index rule
        return str.charAt(len / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = sc.next();

        System.out.println("The middle character in the string: " + getMiddleCharacter(str));
    }
}
