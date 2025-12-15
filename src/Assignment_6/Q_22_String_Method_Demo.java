package Assignment_6;

import java.util.Scanner;

public class Q_22_String_Method_Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length of the string
        System.out.println("Length of the string: " + str.length());

        // First and last character
        System.out.println("First character: '" + str.charAt(0) + "'");
        System.out.println("Last character: '" + str.charAt(str.length() - 1) + "'");

        // Convert to uppercase
        System.out.println("String in uppercase: \"" + str.toUpperCase() + "\"");

        // Convert to lowercase
        System.out.println("String in lowercase: \"" + str.toLowerCase() + "\"");

        // Check if string contains "Java"
        System.out.println("Does the string contain \"Java\"? " + str.contains("Java"));

        // Check if string starts with "Hello"
        System.out.println("Does the string start with \"Hello\"? " + str.startsWith("Hello"));

        // Check if string ends with "World"
        System.out.println("Does the string end with \"World\"? " + str.endsWith("World"));

        // Trim leading and trailing spaces
        String trimmed = str.trim();
        System.out.println("Trimmed string: \"" + trimmed + "\"");

        // Replace 'a' with '@'
        System.out.println("String after replacing 'a' with '@': \"" + str.replace('a', '@') + "\"");

        // Substring from 3rd to 7th character (index 2 to 7, end index inclusive)
        System.out.println("Substring from index 2 to 7: \"" + str.substring(2, 8) + "\"");

        sc.close();
    }
}
