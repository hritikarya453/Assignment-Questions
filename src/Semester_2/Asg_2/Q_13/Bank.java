package Semester_2.Asg_2.Q_13;

public class Bank {

    String bankName;
    double depositAmount;
    static double totalAmount = 0;

    void setBankName(String name) {
        bankName = name;
    }

    void setAmount(double amt) {
        depositAmount = amt;
        totalAmount += depositAmount;
    }

    void showData() {
        System.out.println("Bank Name: " + bankName +
                "\nDeposit Amount: " + depositAmount + "\n");
    }

    static void minDepositBank(Bank[] b) {
        double min = b[0].depositAmount;
        int minIndex = 0;

        for (int i = 1; i < b.length; i++) {
            if (b[i].depositAmount < min) {
                min = b[i].depositAmount;
                minIndex = i;
            }
        }

        System.out.println("Minimum deposit in bank: "
                + b[minIndex].bankName + " Amount: " + min);
    }
}