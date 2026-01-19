package JavaSetPYQ;

import java.util.Scanner;

public class CheckAadhaar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // (a) Taking input using Scanner
        System.out.print("Enter Aadhaar number (XXXX-XXXX-XXXX): ");
        String aadhaar = sc.nextLine();

        boolean isValid = true;

        // (b) Check total length including hyphens (14 characters)
        if (aadhaar.length() != 14) {
            isValid = false;
        }

        // (c) Check grouping and hyphen positions
        if (isValid) {
            if (aadhaar.charAt(4) != '-' || aadhaar.charAt(9) != '-') {
                isValid = false;
            }
        }

        // (d) Check digits in each group
        if (isValid) {
            for (int i = 0; i < aadhaar.length(); i++) {
                if (i == 4 || i == 9)
                    continue;

                if (!Character.isDigit(aadhaar.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }

        // (e) Print result
        if (isValid) {
            System.out.println("Valid Aadhaar Number");
        } else {
            System.out.println("Invalid Aadhaar Number");
        }

        sc.close();
    }
}
