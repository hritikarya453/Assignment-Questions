package Semester_1.JavaSetPYQ;

import java.util.Scanner;

public class Number_Plate {

    public static void main(String[] args) {   // ✔ public added
        Scanner in = new Scanner(System.in);

        String numplate = "OD";

        System.out.println("Enter an alphabet for the number plate (OD_)");
        char ch = Character.toUpperCase(in.next().charAt(0));

        System.out.println("Enter four digit number for your plate:");
        int num = in.nextInt();

        // Checking conditions
        if ((ch >= 'A' && ch <= 'Z') && (num >= 1000 && num <= 9999)) {

            numplate = numplate + ch + num;

            if (numplate.length() == 7) {
                System.out.println("Your Number Plate is: " + numplate); // ✔ printed
            } else {
                System.out.println("Error: Plate length is not 7");
            }

        } else {
            System.out.println("You didn't fulfill the given condition");
        }

        in.close();
    }
}
