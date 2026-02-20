package Semester_1.Extra_Ques.PYQ;
 import java.util.Scanner;
public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bill: ");
        int bill = sc.nextInt();

        int roundedAmount = (int) Math.round(bill / 10.0) * 10;

        System.out.println("Amlan needs to pay: " + roundedAmount);
    }
}
