package Semester_2.Asg_2.Q_11;

import java.util.*;

public class Student {
    int Roll;
    String Name;
    double Dsa_marks;

    void getdata() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Name, Roll No and Dsa Marks");

        Roll = in.nextInt();
        Name = in.nextLine();
        Dsa_marks = in.nextDouble();
    }

    void showdata() {
        System.out.println("Name : " + Name);
        System.out.println("Roll : " + Roll);
        System.out.println("Dsa marks : " + Dsa_marks);
    }
}