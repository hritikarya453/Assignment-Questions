package Semester_2.Asg_1;

public class Q_09_SumMajorDiagonal {

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i <m.length ; i++) {
            sum+=m[i][i];
        }
        return sum;
    }

}
