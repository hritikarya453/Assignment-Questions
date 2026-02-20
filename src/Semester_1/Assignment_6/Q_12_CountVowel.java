package Semester_1.Assignment_6;

import java.util.Scanner;

public class Q_12_CountVowel {

    public static int countVowels2(String str){
        if (str == null) {
            return 0;
        }

        int c = 0;
        String s = str.toLowerCase();   // trim not required

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println("Number of vowels in \"" + str + "\" is " + countVowels2(str));
    }
}
