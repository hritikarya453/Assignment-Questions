package Semester_1.Assignment_6;

import java.util.Scanner;

public class Q_13B_Count_Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
    // manual improved version. // Also handle tab line and new line.
    // checked edge cases.
    public static int countWords(String str) {
        if (str == null) return 0;

        String s = str.trim();
        if (s.isEmpty()) return 0;

        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isWhitespace(s.charAt(i)) && !Character.isWhitespace(s.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

}
