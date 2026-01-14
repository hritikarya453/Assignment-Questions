package Extra_Ques.PYQ;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the bill: ");
        int bill = in.nextInt();
        int billRounded=(int)Math.round(bill/20.0)*20;
        System.out.println("Cashier needs to return: " + (1000 - billRounded));

//        int rem = bill % 20;
//
//        if (rem < 10) {
//            bill -= rem;
//        } else {
//            bill += (20 - rem);
//        }
//
//        System.out.println("Cashier needs to return: " + (1000 - bill));

    }
}