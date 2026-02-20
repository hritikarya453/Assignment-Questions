package Semester_1.Assignment_6;

public class Q_03_Pentagonal_Number {
    public static int getPentagonalNumber(int n){
      return n*(3*n-1)/2;

    }
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            System.out.println(getPentagonalNumber(i));

        }
    }
}
