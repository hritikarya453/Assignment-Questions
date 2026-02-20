package Semester_2.Asg_1;

public class Q_05 {
    public static int sum_Of_Digits(int n){

        while(n>9){
            int sum = 0;
            while (n>0) {
                int digit = n % 10;
                sum+=digit;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
     int n = 9;
        System.out.println(sum_Of_Digits(9294));
    }
}
