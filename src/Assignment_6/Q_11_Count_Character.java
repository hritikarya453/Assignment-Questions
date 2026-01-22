package Assignment_6;

import java.util.Scanner;

public class Q_11_Count_Character {

    public static int count(String str, char a) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);

        System.out.println("The number of occurrences of '" + ch + "' in \"" + str + "\" is " + count(str, ch));
    }
}
