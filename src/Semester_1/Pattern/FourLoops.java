package Semester_1.Pattern;

public class FourLoops {

    static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {
            for (int j = 0; j <= 5-i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 2; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

