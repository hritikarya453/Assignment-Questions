package Assignment3;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks(0-100)");
        byte marks = in.nextByte();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks input.");
        } else {
            int m2 = marks / 10;
            switch (m2) {
                case 4:
                    System.out.println("Grade = E");
                    break;
                case 5:
                    System.out.println("Grade = D");
                    break;
                case 6:
                    System.out.println("Grade = C");
                    break;
                case 7:
                    System.out.println("Grade = B");
                    break;
                case 8:
                    System.out.println("Grade = A");
                    break;
                case 9:
                case 10:
                    System.out.println("Grade = O");
                    break;
                default:
                    System.out.println("Grade = F");

            }

        }

    }
}
