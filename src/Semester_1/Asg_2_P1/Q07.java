package Semester_1.Asg_2_P1;
import java.util.*;
public class Q07 {
    static void main(String[] args) {
        System.out.println("Enter Two Numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a\tb\tpow(a,b)");
        for (int i = 0; i < 5; i++) {
            System.out.println(a + "\t" + b + "\t" + (long) Math.pow(a++, b++));
        }
    }
}
