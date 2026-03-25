package Semester_2.Asg_2.Q_11;

import java.util.Scanner;

public class Student {
    int roll ;
    String name ;
    double DSA_marks;
    void getdata(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the roll no of the student : ");
        roll = in.nextInt();
        in.nextLine();

        System.out.println("Enter the name of the student : ");
        name = in.nextLine();

        System.out.println("Enter the Dsa_marks of the student : ");
        DSA_marks = in.nextDouble();

    }
    void showdata(){
        System.out.println("Roll no : "+ roll);
        System.out.println("Name : "+ name);
        System.out.println("DSA Marks : "+ DSA_marks);
    }
}
