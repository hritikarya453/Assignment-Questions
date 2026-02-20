package Semester_1.Assignment3;

import java.util.Scanner;
public class Q06_Roots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, c :");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d= b*b-4*a*c;
        if(d>0) {
            System.out.println("The equation has two real roots" + ((-b + Math.sqrt(d)) / (2 * a)) + " and " + ((-b - Math.sqrt(d)) / 2 * a));
        } else if(d==0) {
            System.out.println("The equation has one root" + -b / (2 * a));
        }
        else
            System.out.println(("The equation has no real roots"));


    }
}
