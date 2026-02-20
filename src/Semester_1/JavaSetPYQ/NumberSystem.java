package Semester_1.JavaSetPYQ;

public class NumberSystem {
    public static String decToOct(int decimal) {
        if (decimal == 0)
            return "0";

        String res = "";

        while (decimal > 0) {
            int rem = decimal % 8;
            res = rem + res;
            decimal = decimal / 8;
        }

        return res;
    }
    public static String decToBin(int decimal) {
        // Edge case
        if (decimal == 0) {
            return "0";
        }

        String res = "";

        while (decimal > 0) {
            int rem = decimal % 2;
            res = rem + res;
            decimal = decimal / 2;
        }

        return res;
    }
    static int octalToDecimal(int octal) {
        int decimal = 0;
        int base = 1; // 8^0

        while (octal > 0) {
            int digit = octal % 10;
            decimal = decimal + digit * base;
            base = base * 8;
            octal = octal / 10;
        }

        return decimal;
    }


        // Method to convert binary to decimal
        static int binToDec(int binary) {
            int decimal = 0;
            int base = 1; // 2^0

            while (binary > 0) {
                int digit = binary % 10;
                decimal = decimal + digit * base;
                base = base * 2;
                binary = binary / 10;
            }

            return decimal;
        }

    public static void main(String[] args) {

    }

}
