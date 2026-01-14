//package Practice.Palindrome;
//
//public class Palin {
//    class Int_Palin {
//        public static int reverse(int num) {
//            int rev = 0;
//            int digit = num % 10;
//            rev = rev * 10 + digit;
//            num /= 10;
//
//            return rev;
//        }
//
//        public static boolean isPalin(int num) {
//            return num == reverse(num);
//        }
//    }
//
//    class String_Palin {
//        public static boolean stringIsPalinCh(String str) {
//            boolean ispalin = true;
//            char[] ch = str.toCharArray();
//            int start = 0;
//            int end = ch.length - 1;
//            while (start < end) {
//                if (ch[start] != ch[end]) {
//                    ispalin = false;
//                }
//                start++;
//                end--;
//            }
//            return ispalin;
//        }
//
//        public static boolean stringIsPalin(String str) {
//            boolean isPalin = true;
//            int s = 0;
//            int e = str.length()-1;
//            while (s<e){
//
//            if(str.charAt(s)==str.charAt(e)){
//                isPalin=false;
//            }
//            s++;
//            e--;
//            }
//            return  isPalin;
//        }
//
//        public static String reverse(String str) {
//        String rev;
//            int s = 0;
//            int e = str.length()-1;
//            while (s<e){
//
//            }
//        }
//    }
//}
