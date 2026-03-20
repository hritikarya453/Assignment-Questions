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
        System.out.println("Bank name" + bankName +
                "\nDeposit Amount : " + depositAmount
                + "\n");
    }
}

