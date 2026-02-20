package Semester_1.Practice;

import java.util.Arrays;

public class get_CharMethod {
    public static void main(String[] args) {

        char[] arr = new char[20];

        String str1 = "Hello";
        String str2 = "World";

        str1.getChars(0, 5, arr, 0);
        str2.getChars(0, 5, arr, 5);

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // Insert blank space at index 5
        arr[5] = ' ';

        String str3 = "Hritik";
        str3.getChars(0, 6, arr, 6); // start after space

        System.out.println(arr);




        //Creating new array from thr get char method

    }
}
