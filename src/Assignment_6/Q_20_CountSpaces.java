package Assignment_6;

import java.util.Scanner;

public class Q_20_CountSpaces {
    //Question only asking for space So why handle tabs and new lines//Character.isWhitespace(str.charAt(i))
    // No trimming needed //You can handle edge cases if you want
    public static int countSpaces(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.println("Number of spaces in the string: " + countSpaces(str) );
        in.close(); //Mandatory for large projects....
    }
}
