package Assignment_6;

import java.util.Scanner;

public class Q_14_FirstWordUpper {
    public static String toTitleCase(String str){
    String s = str.trim().toLowerCase();
    String res="";
    res+=Character.toUpperCase(s.charAt(0));
        for (int i = 0; i <s.length()-1 ; i++) {

            if (s.charAt(i)==' '&& s.charAt(i+1)!=' '){
                res+=Character.toUpperCase(s.charAt(i+1));
            }else{
                res+=s.charAt(i+1);
            }
        }
        return  res;
    }
    //another
    public static String toTitleCase2(String str) {
        String s = str.trim().toLowerCase();
        String res = "";

        res += Character.toUpperCase(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') {
                res += Character.toUpperCase(s.charAt(i));
            } else {
                res += s.charAt(i);
            }
        }
        return res;
    }
    // handle multiple spaces
    public static String toTitleCase3(String str){
        String s = str.trim().toLowerCase();
        String res="";
        res+=Character.toUpperCase(s.charAt(0));

        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                continue;
            }
            if (s.charAt(i)==' '&& s.charAt(i+1)!=' '){
                res+=Character.toUpperCase(s.charAt(i+1));
            }else{
                res+=s.charAt(i+1);
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println("Converted string: " + toTitleCase3(str));

        in.close();
    }
}