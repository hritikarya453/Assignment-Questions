package Semester_2.Asg_3.Ques_8;

public class Power {

    public static double power(double x,int n){
        if (n==0) {
            return 1;
        }
        return x * power(x,n-1);
    }
//
//    public static void main(String[] args) {
//        System.out.println(power(2,4));
//        System.out.println(power(2,0));
//    }

}
