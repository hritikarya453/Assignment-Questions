package Semester_1.Extra_Ques;

public class Toggle{
    public static void toggleAlphabets(String str){
        String res="";
        int uc=0;
        int lc=0;
        for (int i = 0; i < str.length() ; i++) {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                res += Character.toLowerCase(ch);
                lc++;
            }
            else if(Character.isLowerCase(ch)){
                res += Character.toUpperCase(ch);
                uc++;
            }
            else{
                res += ch;
            }
        }
        System.out.println("Modified String : "+res);
        System.out.println("No of upper case letters : "+uc);
        System.out.println("No of lower case letters : "+lc);
    }
}
