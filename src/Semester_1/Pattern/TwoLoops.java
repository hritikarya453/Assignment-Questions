package Semester_1.Pattern;

public class TwoLoops {
//    static void main(String[] args) {
//        int num = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=i; j++) {
//                if((i+j)%2==0){
//                    System.out.print("1");
//                }
//                System.out.print("0");
//            }
//            System.out.println();
//        }
//
//    }

    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
