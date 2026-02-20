package Semester_1.JavaSetPYQ;

import java.util.Scanner;

public class Matching_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase().replace(" ", "");
        int count = 0;
        for (int i = 0; i < str1.length() ; i++) {
            char ch = str1.charAt(i);
            for (int j = 0; j <str2.length() ; j++) {
                if (str2.charAt(j)==ch){
                    count++;
                    break;
                }
            }
        }

        System.out.println("Number of matching characters: " + count);
    }
}
