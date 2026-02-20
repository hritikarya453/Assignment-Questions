package Semester_2.Asg_1;

public class Q_10_SumOfColumn {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for (int i = 0; i < m.length ; i++) {
            sum+=m[i][columnIndex];
        }
        return sum;
    }
}
