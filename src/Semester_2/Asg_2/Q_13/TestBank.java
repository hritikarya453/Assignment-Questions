package Semester_2.Asg_2.Q_13;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Bank[] b = new Bank[5];

        for (int i = 0; i < 5; i++) {
            b[i] = new Bank();
            System.out.println("Enter the Bank Name :");
            String n = in.nextLine();
            b[i].setBankName(n);
            double amt1;
            do {
                System.out.println("Enter the Deposit Amount :");
                double amt = in.nextDouble();
                amt1=amt;
            }while (amt1<1000);
            b[i].setAmount(amt1);
        }
    }
}
