package Assignment_6;

import java.util.Scanner;

public class Q_17_MiddleCharacter {

    public static char getMiddleCharacter(String str) {
        int len = str.length();
        return str.charAt(len / 2);
    }
    public static char getFirstMiddleCharacter(String str) {
        int len = str.length();
        if(len%2==0){
            return str.charAt(len/2-1);
        }
        return str.charAt(len / 2);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = sc.next();

        System.out.println("The middle character in the string: " + getMiddleCharacter(str));
    }
}
