package Assignment4;

import java.util.Scanner;

public class Q12 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = in.nextInt();
        System.out.println("Enter the exponent");
        int ex = in.nextInt();
        int prod=1;
        for (int i = 1; i <=ex; i++) {
            prod*=base;
        }
        System.out.println(base+" to the power "+ ex+ " is: " +prod);
    }
}
