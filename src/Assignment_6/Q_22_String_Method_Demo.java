package Assignment_6;

import java.util.Scanner;

public class Q_22_String_Method_Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of the string: " + str.length());

        System.out.println("First character: '" + str.charAt(0) + "'");
        System.out.println("Last character: '" + str.charAt(str.length() - 1) + "'");

        System.out.println("String in uppercase: \"" + str.toUpperCase() + "\"");

        System.out.println("String in lowercase: \"" + str.toLowerCase() + "\"");

        System.out.println("Does the string contain \"Java\"? " + str.contains("Java"));

        System.out.println("Does the string start with \"Hello\"? " + str.startsWith("Hello"));

        System.out.println("Does the string end with \"World\"? " + str.endsWith("World"));

        String trimmed = str.trim();
        System.out.println("Trimmed string: \"" + trimmed + "\"");

        System.out.println("String after replacing 'a' with '@': \"" + str.replace('a', '@') + "\"");

        System.out.println("Substring from index 2 to 7: \"" + str.substring(2, 8) + "\"");

        sc.close();
    }
}
