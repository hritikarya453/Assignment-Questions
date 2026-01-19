package JavaSetPYQ;

import java.util.Scanner;

public class ABC_NumValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char ch = Character.toUpperCase(in.next().charAt(0));

        switch (ch) {
            case 'A':
                System.out.println("The numeric value for grade " + ch + " is 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade " + ch + " is 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade " + ch + " is 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade " + ch + " is 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade " + ch + " is 0");
                break;
            default:
                System.out.println(ch + " is an invalid grade");
        }

        in.close();
    }
}
