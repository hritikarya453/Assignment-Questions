package Semester_2.Asg_2.Q_13;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Bank[] b = new Bank[5];

        for (int i = 0; i < 5; i++) {
            b[i] = new Bank();

            System.out.println("Enter Bank Name:");
            String n = in.nextLine();
            b[i].setBankName(n);

            double amt;
            do {
                System.out.println("Enter Deposit Amount (>=1000):");
                amt = in.nextDouble();
            } while (amt < 1000);

            b[i].setAmount(amt);
            in.nextLine(); // LINE BUFFER
        }

        for (Bank e : b) {
            e.showData();
        }

        System.out.println("Total Amount: " + Bank.totalAmount);

        Bank.minDepositBank(b);
    }
}