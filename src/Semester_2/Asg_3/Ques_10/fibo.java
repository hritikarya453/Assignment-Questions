package Semester_2.Asg_3.Ques_10;

public class fibo {
    public static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}
