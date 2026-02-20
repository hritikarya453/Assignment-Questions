package Semester_1.Assignment_6;

public class Q_15B_Palindrome_String {
    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
