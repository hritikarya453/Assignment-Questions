package Assignment3;

import java.util.*;

public class Q10_Grade_Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks (0-100)");
        byte marks = in.nextByte();

        // Invalid case --> exit immediately
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks input.");
            return;
        }

        int m2 = marks / 10;

        switch (m2) {
            case 4:
                System.out.println("Grade = E");
                return;
            case 5:
                System.out.println("Grade = D");
                return;
            case 6:
                System.out.println("Grade = C");
                return;
            case 7:
                System.out.println("Grade = B");
                return;
            case 8:
                System.out.println("Grade = A");
                return;
            case 9:
            case 10:
                System.out.println("Grade = O");
                return;
            default:
                System.out.println("Grade = F");
        }
    }
}
