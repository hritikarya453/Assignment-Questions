package Semester_2.Asg_3.Ques_7;

public class fact {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
