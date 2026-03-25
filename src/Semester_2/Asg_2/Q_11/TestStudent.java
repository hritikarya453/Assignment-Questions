package Semester_2.Asg_2.Q_11;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student[] s = new Student[5];

        double max = Double.NEGATIVE_INFINITY;
        int maxIndex = -1;

        for (int i = 0; i < 5; i++) {
            s[i] = new Student();

            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            s[i].getdata();

            if (s[i].DSA_marks > max) {
                max = s[i].DSA_marks;
                maxIndex = i;
            }
        }

        System.out.println("\n--- Student with Highest DSA Marks ---");
        s[maxIndex].showdata();

        in.close();
    }
}