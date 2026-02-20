package Semester_1.Assignment_6;

public class Practice {
    public static String FirstWordUpper(String str){
        String str2 = str.toLowerCase().trim();
        String res = "";
        res+=Character.toUpperCase(str2.charAt(0));
        for (int i = 0; i < str2.length()-1 ; i++) {
            if (str2.charAt(i) == ' ' && str2.charAt(i + 1) != ' ') {
                res+=Character.toUpperCase(str2.charAt(i+1));
            }else {
                res+=str2.charAt(i+1);
            }
        }
        return res;
    }
    public static boolean isPalindrome(String str){
        int s = 0;
        int e = str.length()-1;
        while (s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
        }
        return true;
    }
}
