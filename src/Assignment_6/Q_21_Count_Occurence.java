package Assignment_6;

import java.util.Scanner;
public class Q_21_Count_Occurence {

    public static void countCharacters(String str) {
        int upper = 0, lower = 0, digits = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }
            else if (Character.isLowerCase(ch)) {
                lower++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                special++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        countCharacters(str);

        in.close();
    }
}
