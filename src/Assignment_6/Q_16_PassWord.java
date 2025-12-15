package Assignment_6;

import java.util.Scanner;

public class Q_16_PassWord {

    public static boolean isValidPassword(String password) {

        // Rule 1: At least 8 characters
        if (password.length() < 8)
            return false;

        int c = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Rule 2: Only letters and digits allowed
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                return false;
            }
            // Count digits
            if (Character.isDigit(ch)) {
                c++;
            }
        }
                                             //WE CAN DIRECTLY PUT LAST CONDITION ON RETURN PATH OF THE METHOD//
                                             //BUT IT SHOULD BE OUTSIDE LOOP CONDITION
        // Rule 3: At least 2 digits         //OR IT SHOULD BE COVERING ALL RETURN PATH....
        if (c < 2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = in.next();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
