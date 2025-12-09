package Assignment_6;

import java.util.Scanner;

public class Q_12B_CountVowel {

    public static int countVowels(String str) {
        if (str == null) return 0;

        int count = 0;
        String vowels = "aeiouAEIOU"; // direct check without toLowerCase()

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println("Number of vowels in \"" + str + "\" is " + countVowels(str));
    }
}
