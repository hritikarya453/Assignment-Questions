package Semester_1.Assignment_5;

public class Q10_B_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = n; j >=1; j--) {
                if (i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}