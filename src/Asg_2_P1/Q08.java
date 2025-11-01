package Asg_2_P1;

import java.util.Scanner;

public class Q08 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many eggs you have?");
        short a = in.nextShort();
        short b = (short) (a/144) ;
        short c = (short) ((a%144)/12);
        short d = (short) ((a%144)%12);
        System.out.println("You have " +b+" gross, " +c+" dozen and "+d+" eggs");
    }

}
