package Assignment_6;

import java.util.Scanner;

public class Q_13_Count_Words {

    public static int countWords(String str) {
        if (str == null) {           // Not pointing to any object
            return 0;
        }
        str = str.trim();            // remove leading & trailing spaces

        if (str.isEmpty()) {         //AFTER TRIMMING ""
            return 0;
        }

        int count = 1; // at least one word
        for (int i = 0; i < str.length() - 1; i++) {
            // count only when current char is space and next char is not space
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();

        int totalWords = countWords(sentence);

        System.out.println("The number of words in the sentence is " + totalWords);
    }
}
