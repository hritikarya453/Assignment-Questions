package JavaSetPYQ;

public class ShiftCharacters {
    public static void main(String[] args) {

        String[] arr = {"ABCD", "XYZ", "JAVA"};

        for (String s : arr) {
            System.out.println(s + " -> " + shiftByTwo(s));
        }
    }

    public static String shiftByTwo(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += (char) (ch + 2); // shift character by 2

        }

        return result;
    }
}
